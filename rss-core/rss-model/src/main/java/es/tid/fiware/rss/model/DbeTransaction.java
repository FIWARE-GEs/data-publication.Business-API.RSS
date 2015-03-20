/**
 * Revenue Settlement and Sharing System GE
 * Copyright (C) 2011-2014, Javier Lucio - lucio@tid.es
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
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package es.tid.fiware.rss.model;

// Generated 06-abr-2012 19:23:11 by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.internal.SessionImpl;
import org.hibernate.engine.transaction.internal.jdbc.JdbcTransaction;

import com.rits.cloning.Cloner;

/**
 * DbeTransaction generated by hbm2java.
 */
@Entity
@DynamicUpdate(value=true)
@DynamicInsert(value=true)
@Table(name = "dbe_transaction", uniqueConstraints = { @UniqueConstraint(columnNames = { "TX_REFERENCE_CODE",
    "NU_SERVICE_ID", "TX_APPLICATION_ID" }) })
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DbeTransaction implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    private String txTransactionId;
    private BmService bmService;
    private BmProduct bmProduct;
    private BmObMop bmObMop;
    private BmObCountry bmClientObCountry;
    private BmMethodsOfPayment bmMethodsOfPayment;
    private BmPaymentbroker bmPaymentbroker;
    private BmCurrency bmCurrency;
    private Date tsRequest;
    private Date tsResponse;
    private String txEndUserId;
    private String tcTransactionType;
    private String txGlobalUserId;
    private String tcTransactionStatus;
    private String txErrCode;
    private String txErrMsg;
    private String txReferenceCode;
    private String txOrgTransactionId;
    private String txCallbackUrl;
    private BigDecimal ftChargedTotalAmount;
    private BigDecimal ftChargedAmount;
    private BigDecimal ftChargedTaxAmount;
    private BigDecimal ftInternalAmount;
    private BigDecimal ftInternalTotalAmount;
    private BigDecimal ftInternalTaxAmount;
    private BigDecimal ftRequestAmount;
    private BigDecimal ftRequestTotalAmount;
    private BigDecimal ftRequestTaxAmount;
    private String txRequestCode;
    private Date tsClientDate;
    private String txOpAttributes;
    private String txPartition;
    private String txPbCorrelationId;
    private String txOrgPbCorrelationId;
    private String txPbResultCode;
    private String txPbResultCodeDesc;
    private String txRequestAmountDesc;
    private String txOperServDesc;
    private String txTaxesApplied;
    private String txPbSpecData;
    private String txTransStatusDesc;
    private String txChannel;
    private String txApplicationId;
    private String txProductClass;
    private String txMerchantId;
    private String txOperationNature;
    private String txMaskedAccountNum;
    private String tcIsRefundedYn = "N";
    private String tcIsCapturedYn = "N";
    private String txSubtypeMop;
    private String txClientZipCode;
    private Date tsStatusDate;
    private String txAppProvider;
    private String txPbUrlRedirection;
    private String txRefundReason;
    private String txRedirectUrl;
    // This field only store in memory
    private boolean boIdempotent = false;

    /**
     * 
     */
    public DbeTransaction() {
    }

    /**
     * 
     * @param txTransactionId
     * @param bmService
     * @param bmObMop
     * @param bmPaymentbroker
     * @param tsRequest
     * @param txEndUserId
     * @param tcTransactionType
     * @param txGlobalUserId
     * @param tcTransactionStatus
     * @param txReferenceCode
     * @param ftRequestAmount
     * @param txPartition
     * @param txRequestAmountDesc
     */
    public DbeTransaction(String txTransactionId, BmService bmService, BmObMop bmObMop,
        BmPaymentbroker bmPaymentbroker, Date tsRequest, String txEndUserId, String tcTransactionType,
        String txGlobalUserId, String tcTransactionStatus, String txReferenceCode, BigDecimal ftRequestAmount,
        String txPartition, String txRequestAmountDesc) {
        this.txTransactionId = txTransactionId;
        this.bmService = bmService;
        this.bmObMop = bmObMop;
        this.bmPaymentbroker = bmPaymentbroker;
        this.tsRequest = tsRequest;
        this.txEndUserId = txEndUserId;
        this.tcTransactionType = tcTransactionType;
        this.txGlobalUserId = txGlobalUserId;
        this.tcTransactionStatus = tcTransactionStatus;
        this.txReferenceCode = txReferenceCode;
        this.ftRequestAmount = ftRequestAmount;
        this.txPartition = txPartition;
        this.txRequestAmountDesc = txRequestAmountDesc;

    }

    /**
     * 
     * @param txTransactionId
     * @param bmService
     * @param bmProduct
     * @param bmObMop
     * @param bmClientObCountry
     * @param bmMethodsOfPayment
     * @param bmPaymentbroker
     * @param bmCurrency
     * @param tsRequest
     * @param tsResponse
     * @param txEndUserId
     * @param tcTransactionType
     * @param txGlobalUserId
     * @param tcTransactionStatus
     * @param txErrCode
     * @param txErrMsg
     * @param txReferenceCode
     * @param txOrgTransactionId
     * @param txReceipRequest
     * @param ftChargedTotalAmount
     * @param ftChargedAmount
     * @param ftInternalAmount
     * @param ftInternalTotalAmount
     * @param ftRequestAmount
     * @param txClientCorrelator
     * @param txRequestCode
     * @param ftChargedTaxAmount
     * @param ftInternalTaxAmount
     * @param ftRequestTaxAmount
     * @param nuSubcriptionPeriod
     * @param tsClientDate
     * @param txOpAttributes
     * @param txPartition
     * @param txPbCorrelationId
     * @param txPbResultCode
     * @param txPbResultCodeDesc
     * @param txOrgPbCorrelationId
     * @param txRequestAmountDesc
     * @param txOperServDesc
     * @param txTaxesApplied
     * @param txPbSpecData
     * @param txTransStatusDesc
     * @param txChannel
     * @param txApplicationId
     * @param txProductClass
     * @param txMerchantId
     * @param txOperationNature
     * @param txMaskedAccountNum
     * @param tcIsRefundedYn
     * @param tcIsCapturedYn
     * @param tcIsPgResultReturned
     */
    public DbeTransaction(String txTransactionId, BmService bmService, BmProduct bmProduct, BmObMop bmObMop,
        BmObCountry bmClientObCountry, BmMethodsOfPayment bmMethodsOfPayment, BmPaymentbroker bmPaymentbroker,
        BmCurrency bmCurrency, Date tsRequest, Date tsResponse, String txEndUserId, String tcTransactionType,
        String txGlobalUserId, String tcTransactionStatus, String txErrCode, String txErrMsg, String txReferenceCode,
        String txOrgTransactionId, String txReceipRequest, BigDecimal ftChargedTotalAmount, BigDecimal ftChargedAmount,
        BigDecimal ftInternalAmount, BigDecimal ftInternalTotalAmount, BigDecimal ftRequestAmount,
        String txClientCorrelator, String txRequestCode, BigDecimal ftChargedTaxAmount, BigDecimal ftInternalTaxAmount,
        BigDecimal ftRequestTaxAmount, Integer nuSubcriptionPeriod, Date tsClientDate, String txOpAttributes,
        String txPartition, String txPbCorrelationId, String txPbResultCode, String txPbResultCodeDesc,
        String txOrgPbCorrelationId, String txRequestAmountDesc, String txOperServDesc, String txTaxesApplied,
        String txPbSpecData, String txTransStatusDesc, String txChannel, String txApplicationId, String txProductClass,
        String txMerchantId, String txOperationNature, String txMaskedAccountNum, String tcIsRefundedYn,
        String tcIsCapturedYn) {

        this.txTransactionId = txTransactionId;
        this.bmService = bmService;
        this.bmProduct = bmProduct;
        this.bmObMop = bmObMop;
        this.bmClientObCountry = bmClientObCountry;
        this.bmMethodsOfPayment = bmMethodsOfPayment;
        this.bmPaymentbroker = bmPaymentbroker;
        this.bmCurrency = bmCurrency;
        this.tsRequest = tsRequest;
        this.tsResponse = tsResponse;
        this.txEndUserId = txEndUserId;
        this.tcTransactionType = tcTransactionType;
        this.txGlobalUserId = txGlobalUserId;
        this.tcTransactionStatus = tcTransactionStatus;
        this.txErrCode = txErrCode;
        this.txErrMsg = txErrMsg;
        this.txReferenceCode = txReferenceCode;
        this.txOrgTransactionId = txOrgTransactionId;
        this.txCallbackUrl = txReceipRequest;
        this.ftChargedTotalAmount = ftChargedTotalAmount;
        this.ftChargedAmount = ftChargedAmount;
        this.ftInternalAmount = ftInternalAmount;
        this.ftInternalTotalAmount = ftInternalTotalAmount;
        this.ftRequestAmount = ftRequestAmount;
        this.txRequestCode = txRequestCode;
        this.ftChargedTaxAmount = ftChargedTaxAmount;
        this.ftInternalTaxAmount = ftInternalTaxAmount;
        this.ftRequestTaxAmount = ftRequestTaxAmount;
        this.tsClientDate = tsClientDate;
        this.txOpAttributes = txOpAttributes;
        this.txPartition = txPartition;
        this.txPbCorrelationId = txPbCorrelationId;
        this.txPbResultCode = txPbResultCode;
        this.txPbResultCodeDesc = txPbResultCodeDesc;
        this.txOrgPbCorrelationId = txOrgPbCorrelationId;
        this.txRequestAmountDesc = txRequestAmountDesc;
        this.txOperServDesc = txOperServDesc;
        this.txTaxesApplied = txTaxesApplied;
        this.txPbSpecData = txPbSpecData;
        this.txTransStatusDesc = txTransStatusDesc;
        this.txChannel = txChannel;
        this.txApplicationId = txApplicationId;
        this.txProductClass = txProductClass;
        this.txMerchantId = txMerchantId;
        this.txOperationNature = txOperationNature;
        this.txMaskedAccountNum = txMaskedAccountNum;
        this.tcIsRefundedYn = tcIsRefundedYn;
        this.tcIsCapturedYn = tcIsCapturedYn;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#clone()
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        DbeTransaction copy;
        Cloner cloner = new Cloner();

        cloner.dontClone(SessionImplementor.class, JdbcTransaction.class, SessionImpl.class);
        copy = cloner.deepClone(this);

        return copy;
    }

    @Id
    // no es posible seq en string o no sabemos si funciona
    // @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SQ_TRANSACTION_ID")
    // @SequenceGenerator(name="SQ_TRANSACTION_ID",sequenceName="SQ_TRANSACTION_ID", allocationSize = 1, initialValue=
    // 1)
    @Column(name = "TX_TRANSACTION_ID", unique = true, nullable = false, length = 40)
    public String getTxTransactionId() {
        return this.txTransactionId;
    }

    public void setTxTransactionId(String txTransactionId) {
        this.txTransactionId = txTransactionId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "NU_SERVICE_ID", nullable = false)
    public BmService getBmService() {
        return this.bmService;
    }

    public void setBmService(BmService bmService) {
        this.bmService = bmService;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NU_PRODUCT_ID")
    public BmProduct getBmProduct() {
        return this.bmProduct;
    }

    public void setBmProduct(BmProduct bmProduct) {
        this.bmProduct = bmProduct;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({ @JoinColumn(name = "NU_INTERNAL_OB_ID", referencedColumnName = "NU_OB_ID", nullable = false),
        @JoinColumn(name = "NU_INTERNAL_COUNTRY_ID", referencedColumnName = "NU_COUNTRY_ID", nullable = false),
        @JoinColumn(name = "NU_INTERNAL_MOP_ID", referencedColumnName = "NU_MOP_ID", nullable = false) })
    public BmObMop getBmObMop() {
        return this.bmObMop;
    }

    public void setBmObMop(BmObMop bmObMop) {
        this.bmObMop = bmObMop;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "NU_REQUEST_MOP_ID")
    public BmMethodsOfPayment getBmMethodsOfPayment() {
        return this.bmMethodsOfPayment;
    }

    public void setBmMethodsOfPayment(BmMethodsOfPayment bmMethodsOfPayment) {
        this.bmMethodsOfPayment = bmMethodsOfPayment;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BM_PB_ID", nullable = true)
    public BmPaymentbroker getBmPaymentbroker() {
        return this.bmPaymentbroker;
    }

    public void setBmPaymentbroker(BmPaymentbroker bmPaymentbroker) {
        this.bmPaymentbroker = bmPaymentbroker;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "NU_CURRENCY_ID")
    public BmCurrency getBmCurrency() {
        return this.bmCurrency;
    }

    public void setBmCurrency(BmCurrency bmCurrency) {
        this.bmCurrency = bmCurrency;
    }

    /*
     * @ManyToOne(fetch = FetchType.LAZY)
     * 
     * @JoinColumns({
     * 
     * @JoinColumn(name = "BM_PB_ID", referencedColumnName = "BM_PB_ID", nullable = false, insertable = false, updatable
     * = false),
     * 
     * @JoinColumn(name = "NU_MOP_ID", referencedColumnName = "NU_MOP_ID", nullable = false, insertable = false,
     * updatable = false) }) public BmPbMop getBmPbMop() { return this.bmPbMop; } public void setBmPbMop(BmPbMop
     * bmPbMop) { this.bmPbMop = bmPbMop; }
     */
    @Temporal(TemporalType.TIMESTAMP)
    // @Column(name = "TS_REQUEST", nullable = false)
    @Column(name = "TS_REQUEST", nullable = false, length = 7)
    // public Serializable getTsRequest() {
    public Date getTsRequest() {
        return this.tsRequest;
    }

    // public void setTsRequest(Serializable tsRequest) {
    public void setTsRequest(Date tsRequest) {
        this.tsRequest = tsRequest;
    }

    @Temporal(TemporalType.TIMESTAMP)
    // @Column(name = "TS_RESPONSE")
    @Column(name = "TS_RESPONSE", nullable = true, length = 7)
    // public Serializable getTsResponse() {
    public Date getTsResponse() {
        return this.tsResponse;
    }

    // public void setTsResponse(Serializable tsResponse) {
    public void setTsResponse(Date tsResponse) {
        this.tsResponse = tsResponse;
    }

    @Column(name = "TX_END_USER_ID", nullable = false, length = 100)
    public String getTxEndUserId() {
        return this.txEndUserId;
    }

    public void setTxEndUserId(String txEndUserId) {
        this.txEndUserId = txEndUserId;
    }

    @Column(name = "TC_TRANSACTION_TYPE", nullable = false, length = 1)
    public String getTcTransactionType() {
        return this.tcTransactionType;
    }

    public void setTcTransactionType(String tcTransactionType) {
        this.tcTransactionType = tcTransactionType;
    }

    @Column(name = "TX_GLOBAL_USER_ID", nullable = true, length = 10)
    public String getTxGlobalUserId() {
        return this.txGlobalUserId;
    }

    public void setTxGlobalUserId(String txGlobalUserId) {
        this.txGlobalUserId = txGlobalUserId;
    }

    @Column(name = "TC_TRANSACTION_STATUS", nullable = false, length = 1)
    public String getTcTransactionStatus() {
        return this.tcTransactionStatus;
    }

    public void setTcTransactionStatus(String tcTransactionStatus) {
        this.tcTransactionStatus = tcTransactionStatus;
    }

    @Column(name = "TX_ERR_CODE", length = 10)
    public String getTxErrCode() {
        return this.txErrCode;
    }

    public void setTxErrCode(String txErrCode) {
        this.txErrCode = txErrCode;
    }

    @Column(name = "TX_ERR_MSG", length = 250)
    public String getTxErrMsg() {
        return this.txErrMsg;
    }

    public void setTxErrMsg(String txErrMsg) {
        this.txErrMsg = txErrMsg;
    }

    @Column(name = "TX_REFERENCE_CODE", nullable = false, length = 40)
    public String getTxReferenceCode() {
        return this.txReferenceCode;
    }

    public void setTxReferenceCode(String txReferenceCode) {
        this.txReferenceCode = txReferenceCode;
    }

    /*
     * @Column(name = "TX_SERVER_REFERENCE_CODE", unique = true, length = 40) public String getTxServerReferenceCode() {
     * return this.txServerReferenceCode; }
     * 
     * public void setTxServerReferenceCode(String txServerReferenceCode) { this.txServerReferenceCode =
     * txServerReferenceCode; }
     */

    @Column(name = "TX_ORG_TRANSACTION_ID", length = 40)
    public String getTxOrgTransactionId() {
        return this.txOrgTransactionId;
    }

    public void setTxOrgTransactionId(String txOrgTransactionId) {
        this.txOrgTransactionId = txOrgTransactionId;
    }

    @Column(name = "TX_CALLBACK_URL", length = 300)
    public String getTxCallbackUrl() {
        return this.txCallbackUrl;
    }

    public void setTxCallbackUrl(String txCallbackUrl) {
        this.txCallbackUrl = txCallbackUrl;
    }

    @Column(name = "FT_CHARGED_TOTAL_AMOUNT", precision = 8, scale = 4)
    public BigDecimal getFtChargedTotalAmount() {
        return this.ftChargedTotalAmount;
    }

    public void setFtChargedTotalAmount(BigDecimal ftChargedTotalAmount) {
        this.ftChargedTotalAmount = ftChargedTotalAmount;
    }

    @Column(name = "FT_CHARGED_AMOUNT", precision = 8, scale = 4)
    public BigDecimal getFtChargedAmount() {
        return this.ftChargedAmount;
    }

    public void setFtChargedAmount(BigDecimal ftChargedAmount) {
        this.ftChargedAmount = ftChargedAmount;
    }

    @Column(name = "FT_INTERNAL_AMOUNT", nullable = true, precision = 8, scale = 4)
    public BigDecimal getFtInternalAmount() {
        return this.ftInternalAmount;
    }

    public void setFtInternalAmount(BigDecimal ftInternalAmount) {
        this.ftInternalAmount = ftInternalAmount;
    }

    @Column(name = "FT_INTERNAL_TOTAL_AMOUNT", nullable = true, precision = 8, scale = 4)
    public BigDecimal getFtInternalTotalAmount() {
        return this.ftInternalTotalAmount;
    }

    public void setFtInternalTotalAmount(BigDecimal ftInternalTotalAmount) {
        this.ftInternalTotalAmount = ftInternalTotalAmount;
    }

    @Column(name = "FT_REQUEST_AMOUNT", nullable = true, precision = 8, scale = 4)
    public BigDecimal getFtRequestAmount() {
        return this.ftRequestAmount;
    }

    public void setFtRequestAmount(BigDecimal ftRequestAmount) {
        this.ftRequestAmount = ftRequestAmount;
    }

    @Column(name = "FT_REQUEST_TOTAL_AMOUNT", nullable = true, precision = 8, scale = 4)
    public BigDecimal getFtRequestTotalAmount() {
        return this.ftRequestTotalAmount;
    }

    public void setFtRequestTotalAmount(BigDecimal ftRequestTotalAmount) {
        this.ftRequestTotalAmount = ftRequestTotalAmount;
    }

    @Column(name = "TX_REQUEST_CODE", length = 40)
    public String getTxRequestCode() {
        return this.txRequestCode;
    }

    public void setTxRequestCode(String txRequestCode) {
        this.txRequestCode = txRequestCode;
    }

    @Column(name = "FT_CHARGED_TAX_AMOUNT", precision = 8, scale = 4)
    public BigDecimal getFtChargedTaxAmount() {
        return this.ftChargedTaxAmount;
    }

    public void setFtChargedTaxAmount(BigDecimal ftChargedTaxAmount) {
        this.ftChargedTaxAmount = ftChargedTaxAmount;
    }

    @Column(name = "FT_INTERNAL_TAX_AMOUNT", precision = 8, scale = 4)
    public BigDecimal getFtInternalTaxAmount() {
        return this.ftInternalTaxAmount;
    }

    public void setFtInternalTaxAmount(BigDecimal ftInternalTaxAmount) {
        this.ftInternalTaxAmount = ftInternalTaxAmount;
    }

    @Column(name = "FT_REQUEST_TAX_AMOUNT", precision = 8, scale = 4)
    public BigDecimal getFtRequestTaxAmount() {
        return this.ftRequestTaxAmount;
    }

    public void setFtRequestTaxAmount(BigDecimal ftRequestTaxAmount) {
        this.ftRequestTaxAmount = ftRequestTaxAmount;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_CLIENT_DATE", nullable = true, length = 7)
    public Date getTsClientDate() {
        return this.tsClientDate;
    }

    // public void setTsClientDate(Serializable tsClientDate) {
    public void setTsClientDate(Date tsClientDate) {
        this.tsClientDate = tsClientDate;
    }

    @Column(name = "TX_OP_ATTRIBUTES", length = 250)
    public String getTxOpAttributes() {
        return this.txOpAttributes;
    }

    public void setTxOpAttributes(String txOpAttributes) {
        this.txOpAttributes = txOpAttributes;
    }

    @Column(name = "TX_PARTITION", nullable = false, length = 2)
    public String getTxPartition() {
        return this.txPartition;
    }

    public void setTxPartition(String txPartition) {
        this.txPartition = txPartition;
    }

    @Column(name = "TX_PB_CORRELATION_ID", length = 100)
    public String getTxPbCorrelationId() {
        return this.txPbCorrelationId;
    }

    public void setTxPbCorrelationId(String txPbCorrelationId) {
        this.txPbCorrelationId = txPbCorrelationId;
    }

    @Column(name = "TX_PB_RESULT_CODE", length = 40)
    public String getTxPbResultCode() {
        return this.txPbResultCode;
    }

    public void setTxPbResultCode(String txPbResultCode) {
        this.txPbResultCode = txPbResultCode;
    }

    @Column(name = "TX_PB_RESULT_CODE_DESC", length = 256)
    public String getTxPbResultCodeDesc() {
        return this.txPbResultCodeDesc;
    }

    public void setTxPbResultCodeDesc(String txPbResultCodeDesc) {
        this.txPbResultCodeDesc = txPbResultCodeDesc;
    }

    @Column(name = "TX_ORG_PB_CORRELATION_ID", length = 100)
    public String getTxOrgPbCorrelationId() {
        return this.txOrgPbCorrelationId;
    }

    public void setTxOrgPbCorrelationId(String txOrgPbCorrelationId) {
        this.txOrgPbCorrelationId = txOrgPbCorrelationId;
    }

    @Column(name = "TX_REQUEST_AMOUNT_DESC", length = 250)
    public String getTxRequestAmountDesc() {
        return this.txRequestAmountDesc;
    }

    public void setTxRequestAmountDesc(String txRequestAmountDesc) {
        this.txRequestAmountDesc = txRequestAmountDesc;
    }

    @Column(name = "TX_OPER_SERV_DESC", length = 250)
    public String getTxOperServDesc() {
        return this.txOperServDesc;
    }

    public void setTxOperServDesc(String txOperServDesc) {
        this.txOperServDesc = txOperServDesc;
    }

    @Column(name = "TX_TAXES_APPLIED", length = 250)
    public String getTxTaxesApplied() {
        return this.txTaxesApplied;
    }

    public void setTxTaxesApplied(String txTaxesApplied) {
        this.txTaxesApplied = txTaxesApplied;
    }

    @Column(name = "TX_PB_SPEC_DATA", length = 1000)
    public String getTxPbSpecData() {
        return this.txPbSpecData;
    }

    public void setTxPbSpecData(String txPbSpecData) {
        this.txPbSpecData = txPbSpecData;
    }

    @Column(name = "TX_TRANS_STATUS_DESC", length = 250)
    public String getTxTransStatusDesc() {
        return this.txTransStatusDesc;
    }

    public void setTxTransStatusDesc(String txTransStatusDesc) {
        this.txTransStatusDesc = txTransStatusDesc;
    }

    @Column(name = "TX_CHANNEL", length = 20)
    public String getTxChannel() {
        return txChannel;
    }

    public void setTxChannel(String txChannel) {
        this.txChannel = txChannel;
    }

    @Column(name = "TX_APPLICATION_ID", length = 40)
    public String getTxApplicationId() {
        return this.txApplicationId;
    }

    public void setTxApplicationId(String txApplicationId) {
        this.txApplicationId = txApplicationId;
    }

    @Column(name = "TX_PRODUCT_CLASS", length = 40)
    public String getTxProductClass() {
        return txProductClass;
    }

    public void setTxProductClass(String txProductClass) {
        this.txProductClass = txProductClass;
    }

    @Column(name = "TX_MERCHANT_ID", length = 40)
    public String getTxMerchantId() {
        return txMerchantId;
    }

    public void setTxMerchantId(String txMerchantId) {
        this.txMerchantId = txMerchantId;
    }

    @Column(name = "TX_OPERATION_NATURE", length = 40)
    public String getTxOperationNature() {
        return txOperationNature;
    }

    public void setTxOperationNature(String txOperationNature) {
        this.txOperationNature = txOperationNature;
    }

    @Column(name = "TX_MASKED_ACCOUNT_NUM", length = 30)
    public String getTxMaskedAccountNum() {
        return txMaskedAccountNum;
    }

    public void setTxMaskedAccountNum(String txMaskedAccountNum) {
        this.txMaskedAccountNum = txMaskedAccountNum;
    }

    @Column(name = "TC_IS_REFUNDED_YN", length = 1, nullable = false, columnDefinition = "char(1) CHARACTER SET latin1 COLLATE latin1_bin NOT NULL DEFAULT 'N'")
    public String getTcIsRefundedYn() {
        return tcIsRefundedYn;
    }

    public void setTcIsRefundedYn(String tcIsRefundedYn) {
        this.tcIsRefundedYn = tcIsRefundedYn;
    }

    @Column(name = "TC_IS_CAPTURED_YN", length = 1, nullable = false, columnDefinition = "char(1) CHARACTER SET latin1 COLLATE latin1_bin NOT NULL DEFAULT 'N'")
    public String getTcIsCapturedYn() {
        return tcIsCapturedYn;
    }

    public void setTcIsCapturedYn(String tcIsCapturedYn) {
        this.tcIsCapturedYn = tcIsCapturedYn;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({ @JoinColumn(name = "NU_CLIENT_OB_ID", referencedColumnName = "NU_OB_ID", nullable = true),
        @JoinColumn(name = "NU_CLIENT_COUNTRY_ID", referencedColumnName = "NU_COUNTRY_ID", nullable = true) })
    public BmObCountry getBmClientObCountry() {
        return bmClientObCountry;
    }

    public void setBmClientObCountry(BmObCountry bmClientObCountry) {
        this.bmClientObCountry = bmClientObCountry;
    }

    /**
     * @return the txSubtypeMop
     */
    @Column(name = "TX_SUBTYPE_MOP", length = 20)
    public String getTxSubtypeMop() {
        return txSubtypeMop;
    }

    /**
     * @param txSubtypeMop
     *            the txSubtypeMop to set
     */
    public void setTxSubtypeMop(String txSubtypeMop) {
        this.txSubtypeMop = txSubtypeMop;
    }

    /**
     * Client zip code.
     * 
     * @return Client zip code.
     */
    @Column(name = "TX_CLIENT_ZIP_CODE", length = 20)
    public String getTxClientZipCode() {
        return txClientZipCode;
    }

    public void setTxClientZipCode(String txClientZipCode) {
        this.txClientZipCode = txClientZipCode;
    }

    /**
     * Last status change date.
     * 
     * @return
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_STATUS_DATE", nullable = false, length = 7)
    public Date getTsStatusDate() {
        return tsStatusDate;
    }

    /**
     * @param tsStatusDate
     *            the tsStatusDate to set
     */
    public void setTsStatusDate(Date tsStatusDate) {
        this.tsStatusDate = tsStatusDate;
    }

    /**
     * App Provider id.
     * 
     * @return app provider id.
     */
    @Column(name = "TX_APP_PROVIDER", length = 20)
    public String getTxAppProvider() {
        return txAppProvider;
    }

    public void setTxAppProvider(String txAppProvider) {
        this.txAppProvider = txAppProvider;
    }

    /**
     * @return the boIdempotent
     */
    @Transient
    public boolean isBoIdempotent() {
        return boIdempotent;
    }

    /**
     * @param boIdempotent
     *            the boIdempotent to set
     */
    public void setBoIdempotent(boolean boIdempotent) {
        this.boIdempotent = boIdempotent;
    }

    /**
     * @return the txPbUrlRedirection
     */
    @Column(name = "TX_PB_URL_REDIRECTION", length = 512)
    public String getTxPbUrlRedirection() {
        return txPbUrlRedirection;
    }

    /**
     * @param txPbUrlRedirection
     *            the txPbUrlRedirection to set
     */
    public void setTxPbUrlRedirection(String txPbUrlRedirection) {
        this.txPbUrlRedirection = txPbUrlRedirection;
    }

    /**
     * @return the txRefundReason
     */
    @Column(name = "TX_REFUND_REASON", length = 40)
    public String getTxRefundReason() {
        return txRefundReason;
    }

    /**
     * @param txRefundReason
     *            the txRefundReason to set
     */
    public void setTxRefundReason(String txRefundReason) {
        this.txRefundReason = txRefundReason;
    }

    /**
     * @return the txRedirectUrl
     */
    @Column(name = "TX_REDIRECT_URL", length = 512)
    public String getTxRedirectUrl() {
        return txRedirectUrl;
    }

    /**
     * @param txRedirectUrl
     *            the txRedirectUrl to set
     */
    public void setTxRedirectUrl(String txRedirectUrl) {
        this.txRedirectUrl = txRedirectUrl;
    }
}
