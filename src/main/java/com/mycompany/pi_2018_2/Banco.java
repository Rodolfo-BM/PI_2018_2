/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pi_2018_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author rodol
 */
public class Banco {
    
    String host;
    String nome;
    String usuario;
    String senha;
    Connection con;
    Statement stmt;

    public Banco() {
    }

    public Banco(String host, String nome, String usuario, String senha, Connection con, Statement stmt) {
        this.host = host;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.con = con;
        this.stmt = stmt;
    }
    
    public void conectar() throws ClassNotFoundException, SQLException {
        
        try {
            Class.forName("org.postgresql.Driver");
            //192.168.47.42
            con = DriverManager.getConnection("jdbc:postgresql://192.168.1.11/casaBancaria",
                    "postgres", "123456");
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void conectar(String host, String nome, String usuario, String senha) 
            throws ClassNotFoundException, SQLException{
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://"+host+"/"+nome+"",
                    usuario, senha);
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void mostrar(String querry) 
            throws ClassNotFoundException, SQLException {
        
        ResultSet rs = stmt.executeQuery(querry);
        
        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
            System.out.print(rs.getMetaData().getColumnName(i));
            System.out.print("/"); 
        }
        System.out.println();
        
        rs.next();
        do {
            for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                System.out.print(rs.getObject(i));
                System.out.print("/"); 
            }
            System.out.println();
        } while(rs.next());
    }
     
    public ResultSet buscarResultado(String querry) 
            throws ClassNotFoundException, SQLException {
        
        ResultSet rs = stmt.executeQuery(querry);
        
        return rs;
    
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    @Override
    public String toString() {
        return "Banco{" + "host=" + host + ", nome=" + nome + ", usuario=" + usuario + ", senha=" + senha + ", con=" + con + ", stmt=" + stmt + '}';
    }
    
    
    
    
}
