/**
 * Revenue Settlement and Sharing System GE
 * Copyright (C) 2011-2014,  Javier Lucio - lucio@tid.es
 * Telefonica Investigacion y Desarrollo, S.A.
 *
 * Copyright (C) 2015, CoNWeT Lab., Universidad Politécnica de Madrid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package es.tid.fiware.rss.expenditureLimit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.tid.fiware.rss.model.BmCurrency;
import es.tid.fiware.rss.model.DbeAppProvider;

/**
 * 
 * The persistent class for the DBE_EXPEND_CONTROL database table.
 * 
 * 
 */

@Entity
@Table(name = "dbe_expend_control")
public class DbeExpendControl implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private DbeExpendLimitPK id;

    @Column(name = "FT_EXPENSED_AMOUNT")
    private BigDecimal ftExpensedAmount;

    @Column(name = "DT_NEXT_PERIOD_START")
    private Date dtNextPeriodStart;

    @Column(name = "TX_NOTIFICATIONS")
    private String txNotifications;

    // bi-directional many-to-one association to BmCurrency
    @ManyToOne
    @JoinColumn(name = "NU_CURRENCY_ID", updatable = false, insertable = false)
    private BmCurrency bmCurrency;

    // bi-directional many-to-one association to DbeAppProvider
    @ManyToOne
    @JoinColumn(name = "TX_APPPROVIDER_ID", updatable = false, insertable = false)
    private DbeAppProvider dbeAppProvider;

    public DbeExpendControl() {
    }

    public DbeExpendLimitPK getId() {
        return this.id;
    }

    public void setId(DbeExpendLimitPK id) {
        this.id = id;
    }

    public BigDecimal getFtExpensedAmount() {
        return this.ftExpensedAmount;
    }

    public void setFtExpensedAmount(BigDecimal ftExpensedAmount) {
        this.ftExpensedAmount = ftExpensedAmount;
    }

    public Date getDtNextPeriodStart() {
        return this.dtNextPeriodStart;
    }

    public void setDtNextPeriodStart(Date dtNextPeriodStart) {
        this.dtNextPeriodStart = dtNextPeriodStart;
    }

    public String getTxNotifications() {
        return this.txNotifications;
    }

    public void setTxNotifications(String txNotifications) {
        this.txNotifications = txNotifications;
    }

    public BmCurrency getBmCurrency() {
        return this.bmCurrency;
    }

    public void setBmCurrency(BmCurrency bmCurrency) {
        this.bmCurrency = bmCurrency;
    }

    public DbeAppProvider getDbeAppProvider() {
        return this.dbeAppProvider;
    }

    public void setDbeAppProvider(DbeAppProvider dbeAppProvider) {
        this.dbeAppProvider = dbeAppProvider;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) bmCurrency.getNuCurrencyId();
        result = prime * result + ((dbeAppProvider == null) ? 0 : dbeAppProvider.getTxAppProviderId().hashCode());
        result = prime * result + ((dtNextPeriodStart == null) ? 0 : dtNextPeriodStart.hashCode());
        result = prime * result + ((ftExpensedAmount == null) ? 0 : ftExpensedAmount.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((txNotifications == null) ? 0 : txNotifications.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        DbeExpendControl other = (DbeExpendControl) obj;
        if (bmCurrency == null) {
            if (other.bmCurrency != null) {
                return false;
            }
        } else if (bmCurrency.getNuCurrencyId() != other.bmCurrency.getNuCurrencyId()) {
            return false;
        }
        if (dbeAppProvider == null) {
            if (other.dbeAppProvider != null) {
                return false;
            }
        } else if (!dbeAppProvider.getTxAppProviderId().equals(other.dbeAppProvider.getTxAppProviderId())) {
            return false;
        }
        if (dtNextPeriodStart == null) {
            if (other.dtNextPeriodStart != null) {
                return false;
            }
        } else if (!dtNextPeriodStart.equals(other.dtNextPeriodStart)) {
            return false;
        }
        if (ftExpensedAmount == null) {
            if (other.ftExpensedAmount != null) {
                return false;
            }
        } else if (ftExpensedAmount.compareTo(other.ftExpensedAmount) != 0) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (txNotifications == null) {
            if (other.txNotifications != null) {
                return false;
            }
        } else if (!txNotifications.equals(other.txNotifications)) {
            return false;
        }
        return true;
    }

}