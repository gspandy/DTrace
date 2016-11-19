package com.kaiyuan.dfb.mobilecenter.model;

import com.kaiyuan.platform.common.model.Tx;

/**
 * Created by lein on 2016/6/6.
 */
public class TxMessage extends Tx {
    private String txComment;
    private String transactionId;
    private Long feeAmount;
    private Long finalAmount;

    public TxMessage() {
    }

    public TxMessage(Tx tx) {
        super(tx);
    }

    public TxMessage(Tx tx, String txComment, String operator) {
        this(tx);
        this.txComment = txComment;
        this.setOperator(operator);
        this.transactionId = tx.getId();
    }

    public TxMessage(TxMessage tx, String txComment, String operator) {
        this(tx);
        this.txComment = txComment;
        this.setOperator(operator);
        this.transactionId = tx.getId();
        this.feeAmount = tx.getFeeAmount() == null ? 0L : tx.getFeeAmount();
        this.finalAmount = tx.getFinalAmount() == null ? tx.getAmount() : tx.getFinalAmount();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTxComment() {
        return txComment;
    }

    public void setTxComment(String txComment) {
        this.txComment = txComment;
    }

    public Long getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(Long feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Long getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Long finalAmount) {
        this.finalAmount = finalAmount;
    }

    @Override
    public String toString() {
        return "TxMessage{" +
                "txComment='" + txComment + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", feeAmount=" + feeAmount +
                ", finalAmount=" + finalAmount +
                "} " + super.toString();
    }
}
