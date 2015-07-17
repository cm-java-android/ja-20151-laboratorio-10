package br.java.android.laboratorio10;

import java.io.Serializable;

public class Moto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6567797347541126188L;
	private long id;
	private String modelo;
	private int cilindradas;
	private int quilometragem;
	private int anoFabricacao;
	private float autonomia;
	private float capacidadeTanque;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	
	@Override
	public String toString() {
		return modelo;
	}
	
	// Getters e Setters
	
	/**
	 * Retorna o valor de id
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * Insere o valor para o atributo id 
	 * @param idParam - valor para o campo id a ser inserido
	 */
	public void setId(long idParam) {
		id = idParam;
	}
	/**
	 * Retorna o valor de modelo
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * Insere o valor para o atributo modelo 
	 * @param modeloParam - valor para o campo modelo a ser inserido
	 */
	public void setModelo(String modeloParam) {
		modelo = modeloParam;
	}
	/**
	 * Retorna o valor de cilindradas
	 * @return the cilindradas
	 */
	public int getCilindradas() {
		return cilindradas;
	}
	/**
	 * Insere o valor para o atributo cilindradas 
	 * @param cilindradasParam - valor para o campo cilindradas a ser inserido
	 */
	public void setCilindradas(int cilindradasParam) {
		cilindradas = cilindradasParam;
	}
	/**
	 * Retorna o valor de quilometragem
	 * @return the quilometragem
	 */
	public int getQuilometragem() {
		return quilometragem;
	}
	/**
	 * Insere o valor para o atributo quilometragem 
	 * @param quilometragemParam - valor para o campo quilometragem a ser inserido
	 */
	public void setQuilometragem(int quilometragemParam) {
		quilometragem = quilometragemParam;
	}
	/**
	 * Retorna o valor de anoFabricacao
	 * @return the anoFabricacao
	 */
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	/**
	 * Insere o valor para o atributo anoFabricacao 
	 * @param anoFabricacaoParam - valor para o campo anoFabricacao a ser inserido
	 */
	public void setAnoFabricacao(int anoFabricacaoParam) {
		anoFabricacao = anoFabricacaoParam;
	}
	/**
	 * Retorna o valor de autonomia
	 * @return the autonomia
	 */
	public float getAutonomia() {
		return autonomia;
	}
	/**
	 * Insere o valor para o atributo autonomia 
	 * @param autonomiaParam - valor para o campo autonomia a ser inserido
	 */
	public void setAutonomia(float autonomiaParam) {
		autonomia = autonomiaParam;
	}
	/**
	 * Retorna o valor de capacidadeTanque
	 * @return the capacidadeTanque
	 */
	public float getCapacidadeTanque() {
		return capacidadeTanque;
	}
	/**
	 * Insere o valor para o atributo capacidadeTanque 
	 * @param capacidadeTanqueParam - valor para o campo capacidadeTanque a ser inserido
	 */
	public void setCapacidadeTanque(float capacidadeTanqueParam) {
		capacidadeTanque = capacidadeTanqueParam;
	}
	/**
	 * Retorna o valor de endereco
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * Insere o valor para o atributo endereco 
	 * @param enderecoParam - valor para o campo endereco a ser inserido
	 */
	public void setEndereco(String enderecoParam) {
		endereco = enderecoParam;
	}
	/**
	 * Retorna o valor de bairro
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}
	/**
	 * Insere o valor para o atributo bairro 
	 * @param bairroParam - valor para o campo bairro a ser inserido
	 */
	public void setBairro(String bairroParam) {
		bairro = bairroParam;
	}
	/**
	 * Retorna o valor de cidade
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}
	/**
	 * Insere o valor para o atributo cidade 
	 * @param cidadeParam - valor para o campo cidade a ser inserido
	 */
	public void setCidade(String cidadeParam) {
		cidade = cidadeParam;
	}
	/**
	 * Retorna o valor de uf
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}
	/**
	 * Insere o valor para o atributo uf 
	 * @param ufParam - valor para o campo uf a ser inserido
	 */
	public void setUf(String ufParam) {
		uf = ufParam;
	}
	
	
}
