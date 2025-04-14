/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.controller;

import br.com.login.dao.Conexao;
import br.com.login.dao.LoginDataAccess;
import br.com.login.view.CadastroView;
import br.com.login.view.LoginView;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author yasmi
 */
public class LoginController {
    
public void cadastroUsuario(CadastroView view) throws SQLException{

    Connection conexao = new Conexao().getConnection();
    LoginDataAccess cadastro = new LoginDataAccess();
    cadastro.cadastrarUsuario(view.getjTextFieldNome().getText(),view.getjTextFieldEmail().getText(),view.getjPasswordFieldSenha().getText());
 
}

public void loginUsuario(LoginView view) throws SQLException{

    Connection conexao = new Conexao().getConnection();
    LoginDataAccess login = new LoginDataAccess();
    login.login(view.getjTextFieldLogin().getText(), view.getjPasswordFieldSenhaLogin().getText());
 
}
    
    
}
