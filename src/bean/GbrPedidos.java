package bean;
// Generated 15/12/2024 23:13:59 by Hibernate Tools 4.3.1

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
 * GbrPedidos generated by hbm2java
 */
@Entity
@Table(name="gbr_pedidos"
    ,catalog="db_giovana_rodrigues"
)
public class GbrPedidos  implements java.io.Serializable {


     private int gbrIdpedidos;
     private int gbrCodigo;
     private Date gbrEmissao;
     private Date gbrEntrega;
     private int gbrQuantidade;
     private double gbrCusto;
     private int gbrCliente;
     private int gbrUsuario;

    public GbrPedidos() {
    }

    public GbrPedidos(int gbrCodigo, Date gbrEmissao, Date gbrEntrega, int gbrQuantidade, double gbrCusto, int gbrCliente, int gbrUsuario) {
       this.gbrCodigo = gbrCodigo;
       this.gbrEmissao = gbrEmissao;
       this.gbrEntrega = gbrEntrega;
       this.gbrQuantidade = gbrQuantidade;
       this.gbrCusto = gbrCusto;
       this.gbrCliente = gbrCliente;
       this.gbrUsuario = gbrUsuario;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="gbr_idpedidos", unique=true, nullable=false)
    public int getGbrIdpedidos() {
        return this.gbrIdpedidos;
    }
    
    public void setGbrIdpedidos(int gbrIdpedidos) {
        this.gbrIdpedidos = gbrIdpedidos;
    }

    
    @Column(name="gbr_codigo", nullable=false)
    public int getGbrCodigo() {
        return this.gbrCodigo;
    }
    
    public void setGbrCodigo(int gbrCodigo) {
        this.gbrCodigo = gbrCodigo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="gbr_emissao", nullable=false, length=10)
    public Date getGbrEmissao() {
        return this.gbrEmissao;
    }
    
    public void setGbrEmissao(Date gbrEmissao) {
        this.gbrEmissao = gbrEmissao;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="gbr_entrega", nullable=false, length=10)
    public Date getGbrEntrega() {
        return this.gbrEntrega;
    }
    
    public void setGbrEntrega(Date gbrEntrega) {
        this.gbrEntrega = gbrEntrega;
    }

    
    @Column(name="gbr_quantidade", nullable=false)
    public int getGbrQuantidade() {
        return this.gbrQuantidade;
    }
    
    public void setGbrQuantidade(int gbrQuantidade) {
        this.gbrQuantidade = gbrQuantidade;
    }

    
    @Column(name="gbr_custo", nullable=false, precision=6)
    public double getGbrCusto() {
        return this.gbrCusto;
    }
    
    public void setGbrCusto(double gbrCusto) {
        this.gbrCusto = gbrCusto;
    }

    
    @Column(name="gbr_cliente", nullable=false)
    public int getGbrCliente() {
        return this.gbrCliente;
    }
    
    public void setGbrCliente(int gbrCliente) {
        this.gbrCliente = gbrCliente;
    }

    
    @Column(name="gbr_usuario", nullable=false)
    public int getGbrUsuario() {
        return this.gbrUsuario;
    }
    
    public void setGbrUsuario(int gbrUsuario) {
        this.gbrUsuario = gbrUsuario;
    }




}


