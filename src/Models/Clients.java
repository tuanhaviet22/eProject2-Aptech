/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tuan
 */
@Entity
@Table(name = "clients")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clients.findAll", query = "SELECT c FROM Clients c"),
    @NamedQuery(name = "Clients.findByClientId", query = "SELECT c FROM Clients c WHERE c.clientId = :clientId"),
    @NamedQuery(name = "Clients.findByClientName", query = "SELECT c FROM Clients c WHERE c.clientName = :clientName"),
    @NamedQuery(name = "Clients.findByClientPassport", query = "SELECT c FROM Clients c WHERE c.clientPassport = :clientPassport"),
    @NamedQuery(name = "Clients.findByClientPhone", query = "SELECT c FROM Clients c WHERE c.clientPhone = :clientPhone"),
    @NamedQuery(name = "Clients.findByClientStatus", query = "SELECT c FROM Clients c WHERE c.clientStatus = :clientStatus")})
public class Clients implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "client_id")
    private Integer clientId;
    @Basic(optional = false)
    @Column(name = "client_name")
    private String clientName;
    @Basic(optional = false)
    @Column(name = "client_passport")
    private int clientPassport;
    @Basic(optional = false)
    @Column(name = "client_phone")
    private int clientPhone;
    @Basic(optional = false)
    @Column(name = "client_status")
    private int clientStatus;

    public Clients() {
    }

    public Clients(Integer clientId) {
        this.clientId = clientId;
    }

    public Clients(Integer clientId, String clientName, int clientPassport, int clientPhone, int clientStatus) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientPassport = clientPassport;
        this.clientPhone = clientPhone;
        this.clientStatus = clientStatus;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientPassport() {
        return clientPassport;
    }

    public void setClientPassport(int clientPassport) {
        this.clientPassport = clientPassport;
    }

    public int getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(int clientPhone) {
        this.clientPhone = clientPhone;
    }

    public int getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(int clientStatus) {
        this.clientStatus = clientStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientId != null ? clientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clients)) {
            return false;
        }
        Clients other = (Clients) object;
        if ((this.clientId == null && other.clientId != null) || (this.clientId != null && !this.clientId.equals(other.clientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Clients[ clientId=" + clientId + " ]";
    }
    
}
