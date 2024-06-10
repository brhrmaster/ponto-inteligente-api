package com.cisoft.pontointeligente.api.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_empresa")
public class Empresa extends EntityModel implements Serializable {
	private static final long serialVersionUID = 2199661297977328418L;

	private String razaoSocial;
	private String cnpj;
	private List<Funcionario> funcionarios;
	
	public Empresa() {
		
	}

	@Column(name = "razao_social", nullable = false)
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@Column(name = "cnpj", nullable = false)
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@OneToMany(mappedBy = "tbl_empresa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public String toString() {
		return "Empresa [id=" + this.getId() + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", dataCriacao=" + this.getDataCriacao() + ", dataAtualizacao=" + this.getDataAtualizacao() + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
