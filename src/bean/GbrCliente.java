package bean;
// Generated 12/01/2025 02:09:24 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GbrCliente generated by hbm2java
 */
@Entity
@Table(name="gbr_cliente"
    ,catalog="db_giovana_rodrigues"
)
public class GbrCliente  implements java.io.Serializable {


     private int gbrIdcliente;
     private String gbrNome;
     private Date gbrDataNasc;
     private String gbrCpf;
     private String gbrEmail;
     private String gbrTelefone;
     private String gbrSexo;
     private String gbrCep;
     private String gbrEstado;
     private String gbrCidade;
     private String gbrEndereco;
     private String gbrNumero;
     private String gbrEstadoCivil;
     private String gbrRg;

    public GbrCliente() {
    }

	
    public GbrCliente(String gbrNome, Date gbrDataNasc, String gbrCpf, String gbrTelefone, String gbrCep, String gbrEstado, String gbrCidade, String gbrEndereco, String gbrEstadoCivil, String gbrRg) {
        this.gbrNome = gbrNome;
        this.gbrDataNasc = gbrDataNasc;
        this.gbrCpf = gbrCpf;
        this.gbrTelefone = gbrTelefone;
        this.gbrCep = gbrCep;
        this.gbrEstado = gbrEstado;
        this.gbrCidade = gbrCidade;
        this.gbrEndereco = gbrEndereco;
        this.gbrEstadoCivil = gbrEstadoCivil;
        this.gbrRg = gbrRg;
    }
    public GbrCliente(String gbrNome, Date gbrDataNasc, String gbrCpf, String gbrEmail, String gbrTelefone, String gbrSexo, String gbrCep, String gbrEstado, String gbrCidade, String gbrEndereco, String gbrNumero, String gbrEstadoCivil, String gbrRg) {
       this.gbrNome = gbrNome;
       this.gbrDataNasc = gbrDataNasc;
       this.gbrCpf = gbrCpf;
       this.gbrEmail = gbrEmail;
       this.gbrTelefone = gbrTelefone;
       this.gbrSexo = gbrSexo;
       this.gbrCep = gbrCep;
       this.gbrEstado = gbrEstado;
       this.gbrCidade = gbrCidade;
       this.gbrEndereco = gbrEndereco;
       this.gbrNumero = gbrNumero;
       this.gbrEstadoCivil = gbrEstadoCivil;
       this.gbrRg = gbrRg;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="gbr_idcliente", unique=true, nullable=false)
    public int getGbrIdcliente() {
        return this.gbrIdcliente;
    }
    
    public void setGbrIdcliente(int gbrIdcliente) {
        this.gbrIdcliente = gbrIdcliente;
    }

    
    @Column(name="gbr_nome", nullable=false, length=60)
    public String getGbrNome() {
        return this.gbrNome;
    }
    
    public void setGbrNome(String gbrNome) {
        this.gbrNome = gbrNome;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="gbr_dataNasc", nullable=false, length=10)
    public Date getGbrDataNasc() {
        return this.gbrDataNasc;
    }
    
    public void setGbrDataNasc(Date gbrDataNasc) {
        this.gbrDataNasc = gbrDataNasc;
    }

    
    @Column(name="gbr_cpf", nullable=false, length=11)
    public String getGbrCpf() {
        return this.gbrCpf;
    }
    
    public void setGbrCpf(String gbrCpf) {
        this.gbrCpf = gbrCpf;
    }

    
    @Column(name="gbr_email", length=50)
    public String getGbrEmail() {
        return this.gbrEmail;
    }
    
    public void setGbrEmail(String gbrEmail) {
        this.gbrEmail = gbrEmail;
    }

    
    @Column(name="gbr_telefone", nullable=false, length=14)
    public String getGbrTelefone() {
        return this.gbrTelefone;
    }
    
    public void setGbrTelefone(String gbrTelefone) {
        this.gbrTelefone = gbrTelefone;
    }

    
    @Column(name="gbr_sexo", length=1)
    public String getGbrSexo() {
        return this.gbrSexo;
    }
    
    public void setGbrSexo(String gbrSexo) {
        this.gbrSexo = gbrSexo;
    }

    
    @Column(name="gbr_cep", nullable=false, length=8)
    public String getGbrCep() {
        return this.gbrCep;
    }
    
    public void setGbrCep(String gbrCep) {
        this.gbrCep = gbrCep;
    }

    
    @Column(name="gbr_estado", nullable=false, length=2)
    public String getGbrEstado() {
        return this.gbrEstado;
    }
    
    public void setGbrEstado(String gbrEstado) {
        this.gbrEstado = gbrEstado;
    }

    
    @Column(name="gbr_cidade", nullable=false, length=45)
    public String getGbrCidade() {
        return this.gbrCidade;
    }
    
    public void setGbrCidade(String gbrCidade) {
        this.gbrCidade = gbrCidade;
    }

    
    @Column(name="gbr_endereco", nullable=false, length=45)
    public String getGbrEndereco() {
        return this.gbrEndereco;
    }
    
    public void setGbrEndereco(String gbrEndereco) {
        this.gbrEndereco = gbrEndereco;
    }

    
    @Column(name="gbr_numero", length=5)
    public String getGbrNumero() {
        return this.gbrNumero;
    }
    
    public void setGbrNumero(String gbrNumero) {
        this.gbrNumero = gbrNumero;
    }

    
    @Column(name="gbr_EstadoCivil", nullable=false, length=45)
    public String getGbrEstadoCivil() {
        return this.gbrEstadoCivil;
    }
    
    public void setGbrEstadoCivil(String gbrEstadoCivil) {
        this.gbrEstadoCivil = gbrEstadoCivil;
    }

    
    @Column(name="gbr_rg", nullable=false, length=10)
    public String getGbrRg() {
        return this.gbrRg;
    }
    
    public void setGbrRg(String gbrRg) {
        this.gbrRg = gbrRg;
    }




}


