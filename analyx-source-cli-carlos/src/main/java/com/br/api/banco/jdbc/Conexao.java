package com.br.api.banco.jdbc;

import com.br.api.dados.Logger;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author consultor
 */
public class Conexao {

    private JdbcTemplate conexaoDoBanco;
    
    public Conexao() {
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dataSource.setUrl("jdbc:mysql://0.0.0.0:3306/bd_analyx?autoReconnect=true&useSSL=false");;

        dataSource.setUsername("root");

        dataSource.setPassword("urubu100");
//
//        dataSource.setUrl("jdbc:mysql://localhost:3306/bd_analyx?autoReconnect=true&useSSL=false");
//
//        dataSource.setUsername("admin");
//
//        dataSource.setPassword("1234");

        this.conexaoDoBanco = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexaoDoBanco() {
        return conexaoDoBanco;
    }

}
