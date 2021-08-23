package br.ma.gov.imperatriz.contribuinte.contigenterps.mb.dashboard;

import br.ma.gov.imperatriz.contribuinte.contigenterps.bo.audit.AuditingBO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.bo.dashboard.DashboardAuditoriaBO;
import br.ma.gov.imperatriz.contribuinte.contigenterps.vo.dashboard.DashboardAuditoria;
import br.ma.gov.imperatriz.contribuinte.contigenterps.vo.audit.TabelaAuditoria;
import com.xpert.core.exception.BusinessException;
import com.xpert.faces.utils.FacesMessageUtils;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author ayslanms
 */
@Named
@ViewScoped
public class DashboardAuditoriaMB implements Serializable {

    @EJB
    private DashboardAuditoriaBO dashboardAuditoriaBO;
    @EJB
    private AuditingBO auditingBO;

    private DashboardAuditoria dashboardAuditoria;
    private List<TabelaAuditoria> tabelas;

    @PostConstruct
    public void init() {
        try {
            dashboardAuditoria = dashboardAuditoriaBO.getDashboardAuditoria();
            tabelas = auditingBO.getTabelasAuditoria();
        } catch (BusinessException ex) {
            FacesMessageUtils.error(ex);
        }
    }

    public void carregarDashboard() {
        try {
            dashboardAuditoriaBO.carregarDashboardAuditoria(dashboardAuditoria);
        } catch (BusinessException ex) {
            FacesMessageUtils.error(ex);
        }
    }

    public DashboardAuditoria getDashboardAuditoria() {
        return dashboardAuditoria;
    }

    public void setDashboardAuditoria(DashboardAuditoria dashboardAuditoria) {
        this.dashboardAuditoria = dashboardAuditoria;
    }

    public List<TabelaAuditoria> getTabelas() {
        return tabelas;
    }

    public void setTabelas(List<TabelaAuditoria> tabelas) {
        this.tabelas = tabelas;
    }
    
    

}
