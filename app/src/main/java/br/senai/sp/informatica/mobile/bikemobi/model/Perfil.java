package br.senai.sp.informatica.mobile.bikemobi.model;

import com.google.gson.annotations.SerializedName;

import java.sql.Date;

/**
 * Created by 43255815886 on 28/02/2018.
 */

public class Perfil {

    @SerializedName("id")
    private int id;

    @SerializedName("nome")
    private String nome;

    @SerializedName("dataNascimento")
    private Date dataNascimento;

    @SerializedName("localidade")
    private String localidade;

    @SerializedName("bio")
    private String bio;

    @SerializedName("avatarUrl")
    private String avatarUrl;

    @SerializedName("dataCriacao")
    private Date dataCriacao;

    @SerializedName("loginId")
    private int loginId;

    public Perfil() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", localidade='" + localidade + '\'' +
                ", bio='" + bio + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", loginId=" + loginId +
                '}';
    }
}
