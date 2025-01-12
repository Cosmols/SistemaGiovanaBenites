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
 * GbrVendedor generated by hbm2java
 */
@Entity
@Table(name="gbr_vendedor"
    ,catalog="db_giovana_rodrigues"
)
public class GbrVendedor  implements java.io.Serializable {


     private int gbrIdvendedor;
     private String gbrCodigo;
     private String gbrNome;
     private char gbrSexo;
     private String gbrEmail;
     private String gbrCep;
     private String gbrEndereco;
     private String gbrBairro;
     private String gbrCidade;
     private String gbrEstado;
     private String gbrNumero;
     private String gbrTelefone;
     private Date gbrDataInicio;
     private Date gbrDataEncerramento;
     private Date gbrDataNasc;

    public GbrVendedor() {
    }

	
    public GbrVendedor(String gbrCodigo, String gbrNome, char gbrSexo, String gbrEmail, String gbrCep, String gbrEndereco, String gbrBairro, String gbrCidade, String gbrEstado, String gbrNumero, String gbrTelefone, Date gbrDataInicio, Date gbrDataNasc) {
        this.gbrCodigo = gbrCodigo;
        this.gbrNome = gbrNome;
        this.gbrSexo = gbrSexo;
        this.gbrEmail = gbrEmail;
        this.gbrCep = gbrCep;
        this.gbrEndereco = gbrEndereco;
        this.gbrBairro = gbrBairro;
        this.gbrCidade = gbrCidade;
        this.gbrEstado = gbrEstado;
        this.gbrNumero = gbrNumero;
        this.gbrTelefone = gbrTelefone;
        this.gbrDataInicio = gbrDataInicio;
        this.gbrDataNasc = gbrDataNasc;
    }
    public GbrVendedor(String gbrCodigo, String gbrNome, char gbrSexo, String gbrEmail, String gbrCep, String gbrEndereco, String gbrBairro, String gbrCidade, String gbrEstado, String gbrNumero, String gbrTelefone, Date gbrDataInicio, Date gbrDataEncerramento, Date gbrDataNasc) {
       this.gbrCodigo = gbrCodigo;
       this.gbrNome = gbrNome;
       this.gbrSexo = gbrSexo;
       this.gbrEmail = gbrEmail;
       this.gbrCep = gbrCep;
       this.gbrEndereco = gbrEndereco;
       this.gbrBairro = gbrBairro;
       this.gbrCidade = gbrCidade;
       this.gbrEstado = gbrEstado;
       this.gbrNumero = gbrNumero;
       this.gbrTelefone = gbrTelefone;
       this.gbrDataInicio = gbrDataInicio;
       this.gbrDataEncerramento = gbrDataEncerramento;
       this.gbrDataNasc = gbrDataNasc;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="gbr_idvendedor", unique=true, nullable=false)
    public int getGbrIdvendedor() {
        return this.gbrIdvendedor;
    }
    
    public void setGbrIdvendedor(int gbrIdvendedor) {
        this.gbrIdvendedor = gbrIdvendedor;
    }

    
    @Column(name="gbr_codigo", nullable=false, length=45)
    public String getGbrCodigo() {
        return this.gbrCodigo;
    }
    
    public void setGbrCodigo(String gbrCodigo) {
        this.gbrCodigo = gbrCodigo;
    }

    
    @Column(name="gbr_nome", nullable=false, length=50)
    public String getGbrNome() {
        return this.gbrNome;
    }
    
    public void setGbrNome(String gbrNome) {
        this.gbrNome = gbrNome;
    }

    
    @Column(name="gbr_sexo", nullable=false, length=1)
    public char getGbrSexo() {
        return this.gbrSexo;
    }
    
    public void setGbrSexo(char gbrSexo) {
        this.gbrSexo = gbrSexo;
    }

    
    @Column(name="gbr_email", nullable=false, length=45)
    public String getGbrEmail() {
        return this.gbrEmail;
    }
    
    public void setGbrEmail(String gbrEmail) {
        this.gbrEmail = gbrEmail;
    }

    
    @Column(name="gbr_cep", nullable=false, length=8)
    public String getGbrCep() {
        return this.gbrCep;
    }
    
    public void setGbrCep(String gbrCep) {
        this.gbrCep = gbrCep;
    }

    
    @Column(name="gbr_endereco", nullable=false, length=45)
    public String getGbrEndereco() {
        return this.gbrEndereco;
    }
    
    public void setGbrEndereco(String gbrEndereco) {
        this.gbrEndereco = gbrEndereco;
    }

    
    @Column(name="gbr_bairro", nullable=false, length=45)
    public String getGbrBairro() {
        return this.gbrBairro;
    }
    
    public void setGbrBairro(String gbrBairro) {
        this.gbrBairro = gbrBairro;
    }

    
    @Column(name="gbr_cidade", nullable=false, length=45)
    public String getGbrCidade() {
        return this.gbrCidade;
    }
    
    public void setGbrCidade(String gbrCidade) {
        this.gbrCidade = gbrCidade;
    }

    
    @Column(name="gbr_estado", nullable=false, length=2)
    public String getGbrEstado() {
        return this.gbrEstado;
    }
    
    public void setGbrEstado(String gbrEstado) {
        this.gbrEstado = gbrEstado;
    }

    
    @Column(name="gbr_numero", nullable=false, length=5)
    public String getGbrNumero() {
        return this.gbrNumero;
    }
    
    public void setGbrNumero(String gbrNumero) {
        this.gbrNumero = gbrNumero;
    }

    
    @Column(name="gbr_telefone", nullable=false, length=14)
    public String getGbrTelefone() {
        return this.gbrTelefone;
    }
    
    public void setGbrTelefone(String gbrTelefone) {
        this.gbrTelefone = gbrTelefone;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="gbr_dataInicio", nullable=false, length=10)
    public Date getGbrDataInicio() {
        return this.gbrDataInicio;
    }
    
    public void setGbrDataInicio(Date gbrDataInicio) {
        this.gbrDataInicio = gbrDataInicio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="gbr_dataEncerramento", length=10)
    public Date getGbrDataEncerramento() {
        return this.gbrDataEncerramento;
    }
    
    public void setGbrDataEncerramento(Date gbrDataEncerramento) {
        this.gbrDataEncerramento = gbrDataEncerramento;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="gbr_dataNasc", nullable=false, length=10)
    public Date getGbrDataNasc() {
        return this.gbrDataNasc;
    }
    
    public void setGbrDataNasc(Date gbrDataNasc) {
        this.gbrDataNasc = gbrDataNasc;
    }




}


