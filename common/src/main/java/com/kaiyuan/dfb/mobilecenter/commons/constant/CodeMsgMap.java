package com.kaiyuan.dfb.mobilecenter.commons.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 错误码map
 * Created by liuming@che001.com on 2016/9/12.
 */
public class CodeMsgMap {

    private static Map<String, CodeMsgEnum> codeMsgEnumMap = new HashMap<>();

    static {
        codeMsgEnumMap.put("ERR_TX_CREATION_FAILED", CodeMsgEnum.ERR_TX_CREATION_FAILED);
        codeMsgEnumMap.put("ERR_ACC_DUPLICATE_ACCOUNTING", CodeMsgEnum.ERR_ACC_DUPLICATE_ACCOUNTING);
        codeMsgEnumMap.put("000X000X000", CodeMsgEnum.ErrObj);
        codeMsgEnumMap.put("001X001X000", CodeMsgEnum.PAYER_ACCOUNTSERVICE_NULL);
        codeMsgEnumMap.put("001X001X001", CodeMsgEnum.PAYER_USER_NULL);
        codeMsgEnumMap.put("001X001X002", CodeMsgEnum.PAYER_USER_STATUS_ERR);
        codeMsgEnumMap.put("001X001X003", CodeMsgEnum.PAYER_USER_NOT_SELF_ERR);
        codeMsgEnumMap.put("001X001X004", CodeMsgEnum.PAYER_USER_RECEIVER_SELF_ERR);
        codeMsgEnumMap.put("001X001X005", CodeMsgEnum.PAYER_USER_NOT_DO_NAMECHECK);
        codeMsgEnumMap.put("001X001X006", CodeMsgEnum.PAYER_SERVICEACCOUNT_FULL_NAME_NOT_FOUND);
        codeMsgEnumMap.put("001X001X007", CodeMsgEnum.PAYER_STORE_NOT_FOUND);
        codeMsgEnumMap.put("001X001X008", CodeMsgEnum.PAYER_STORE_NAME_NOT_FOUND);
        codeMsgEnumMap.put("001X001X009", CodeMsgEnum.PAYER_ACCOUNT_NULL);
        codeMsgEnumMap.put("001X001X010", CodeMsgEnum.PAYER_ACCOUNT_STATUS_ERR);
        codeMsgEnumMap.put("001X001X011", CodeMsgEnum.PAYER_ACCOUNT_NOT_ACTIVATED);
        codeMsgEnumMap.put("001X001X012", CodeMsgEnum.PAYER_ACCOUNT_AMOUNT_LESS);
        codeMsgEnumMap.put("001X001X013", CodeMsgEnum.PAYER_ACCOUNT_AF_AMOUNT_LESS);
        codeMsgEnumMap.put("001X001X014", CodeMsgEnum.PAYER_ACCOUNT_CF_AMOUNT_LESS);
        codeMsgEnumMap.put("001X001X018", CodeMsgEnum.PAYER_ACCOUNT_QYD_AMOUNT_LESS);
        codeMsgEnumMap.put("001X001X015", CodeMsgEnum.PAYER_CARD_NULL);
        codeMsgEnumMap.put("001X001X016", CodeMsgEnum.PAYER_CARD_NOT_ALLOWED);
        codeMsgEnumMap.put("001X001X017", CodeMsgEnum.PAYER_CARD_CSC_ERR);
        codeMsgEnumMap.put("001X001X020", CodeMsgEnum.RECEIVER_ACCOUNTSERVICE_NULL);
        codeMsgEnumMap.put("001X001X021", CodeMsgEnum.RECEIVER_USER_NULL);
        codeMsgEnumMap.put("001X001X022", CodeMsgEnum.RECEIVER_USER_STATUS_ERR);
        codeMsgEnumMap.put("001X001X023", CodeMsgEnum.RECEIVER_USER_RECEIVER_SELF_ERR);
        codeMsgEnumMap.put("001X001X024", CodeMsgEnum.RECEIVER_USER_RECEIVER_NOT_SELF_ERR);
        codeMsgEnumMap.put("001X001X025", CodeMsgEnum.RECEIVER_USER_NOT_DO_NAMECHECK);
        codeMsgEnumMap.put("001X001X026", CodeMsgEnum.RECEIVER_SERVICEACCOUNT_FULL_NAME_NOT_FOUND);
        codeMsgEnumMap.put("001X001X027", CodeMsgEnum.RECEIVER_STORE_NOT_FOUND);
        codeMsgEnumMap.put("001X001X028", CodeMsgEnum.RECEIVER_STORE_NAME_NOT_FOUND);
        codeMsgEnumMap.put("001X001X029", CodeMsgEnum.RECEIVER_ACCOUNT_NULL);
        codeMsgEnumMap.put("001X001X030", CodeMsgEnum.RECEIVER_ACCOUNT_STATUS_ERR);
        codeMsgEnumMap.put("001X001X031", CodeMsgEnum.RECEIVER_ACCOUNT_NOT_ACTIVATED);
        codeMsgEnumMap.put("001X001X032", CodeMsgEnum.RECEIVER_CARD_NULL);
        codeMsgEnumMap.put("001X001X033", CodeMsgEnum.RECEIVER_CARD_NOT_ALLOWED);
        codeMsgEnumMap.put("001X001X040", CodeMsgEnum.TRANS_ORDER_NULL);
        codeMsgEnumMap.put("001X001X041", CodeMsgEnum.TRANS_ORDER_TYPE_ERR);
        codeMsgEnumMap.put("001X001X042", CodeMsgEnum.TRANS_ORDER_STATUS_ERR);
        codeMsgEnumMap.put("001X001X043", CodeMsgEnum.TRANS_ORDER_CHILD_NULL);
        codeMsgEnumMap.put("001X001X044", CodeMsgEnum.TRANS_ORDER_AMOUNT_ERR);
        codeMsgEnumMap.put("001X001X045", CodeMsgEnum.TRANS_ORDER_ILLEGAL_OPERATION);
        codeMsgEnumMap.put("001X001X046", CodeMsgEnum.TRANS_ORDER_ROYALTY_PARAMET_ERR);
        codeMsgEnumMap.put("001X001X047", CodeMsgEnum.TRANS_ORDER_USER_NOT_LOGGED);
        codeMsgEnumMap.put("001X001X060", CodeMsgEnum.ERR_PAYER_ACCOUNT_UPDATE_FAILED);
        codeMsgEnumMap.put("001X001X061", CodeMsgEnum.ERR_PAYER_CARD_UPDATE_FAILED);
        codeMsgEnumMap.put("001X001X062", CodeMsgEnum.ERR_TX_LOCKED_FUND_CREATION_FAILED);
        codeMsgEnumMap.put("001X001X063", CodeMsgEnum.ERR_TX_REVIEW_CREATION_FAILED);
        codeMsgEnumMap.put("001X001X064", CodeMsgEnum.ERR_OTP_CREATION_FAILED);
        codeMsgEnumMap.put("001X001X065", CodeMsgEnum.ERR_TX_UPDATE_FAILED);
        codeMsgEnumMap.put("001X001X066", CodeMsgEnum.ERR_TX_QYD_AMOUNT_ERROR);
        codeMsgEnumMap.put("001X001X067", CodeMsgEnum.ERR_TX_QYD_AMOUNT_LESS_ERROR);
        codeMsgEnumMap.put("001X001X080", CodeMsgEnum.APPROVE_LOGGED_USER_ERR);
        codeMsgEnumMap.put("001X001X081", CodeMsgEnum.APPROVE_TX_OTP_NULL);
        codeMsgEnumMap.put("001X001X082", CodeMsgEnum.APPROVE_TX_OTP_GONE);
        codeMsgEnumMap.put("001X001X083", CodeMsgEnum.APPROVE_TX_OTP_PROCESS_ERR);
        codeMsgEnumMap.put("001X001X084", CodeMsgEnum.APPROVE_ERR_PAYER_ACCOUNT_UPDATE_FAILED);
        codeMsgEnumMap.put("001X001X085", CodeMsgEnum.APPROVE_ERR_PAYER_CARD_UPDATE_FAILED);
        codeMsgEnumMap.put("001X001X086", CodeMsgEnum.APPROVE_ERR_RECEIVER_ACCOUNT_UPDATE_FAILED);
        codeMsgEnumMap.put("001X001X087", CodeMsgEnum.APPROVE_ERR_RECEIVER_CARD_UPDATE_FAILED);
        codeMsgEnumMap.put("001X001X088", CodeMsgEnum.APPROVE_ERR_TX_LOCKED_FUND_UPDATE_FAILED);
        codeMsgEnumMap.put("001X001X089", CodeMsgEnum.APPROVE_ERR_TX_TRANSFERRED_FUND_PAYER_REGULAR_CREATION_FAILED);
        codeMsgEnumMap.put("001X001X090", CodeMsgEnum.APPROVE_ERR_TX_TRANSFERRED_FUND_RECEIVER_REGULAR_CREATION_FAILED);
        codeMsgEnumMap.put("001X001X091", CodeMsgEnum.APPROVE_ERR_TX_FOR_FEE_CREATION_FAILED);
        codeMsgEnumMap.put("001X001X092", CodeMsgEnum.APPROVE_ERR_TX_TRANSFERRED_FUND_RECEIVER_FEE_CREATION_FAILED);
        codeMsgEnumMap.put("001X001X093", CodeMsgEnum.APPROVE_ERR_TX_TRANSFERRED_FUND_AUTOCHINA_FEE_CREATION_FAILED);
        codeMsgEnumMap.put("001X001X094", CodeMsgEnum.APPROVE_ERR_OTP_UPDATE_FAILED);
        codeMsgEnumMap.put("001X001X095", CodeMsgEnum.APPROVE_ERR_TX_UPDATE_FAILED);
        codeMsgEnumMap.put("001X001X100", CodeMsgEnum.SPECIAL_PATCH_AMT_ERR);
        codeMsgEnumMap.put("001X001X101", CodeMsgEnum.SPECIAL_PATCH_PHONE_ERR);
        codeMsgEnumMap.put("001X001X102", CodeMsgEnum.SPECIAL_PATCH_VERIFYCODE_NULL);
        codeMsgEnumMap.put("001X001X103", CodeMsgEnum.SPECIAL_PATCH_VERIFYCODE_ERR);
        codeMsgEnumMap.put("001X001X104", CodeMsgEnum.SPECIAL_PATCH_VERIFYCODE_USED);
        codeMsgEnumMap.put("001X001X110", CodeMsgEnum.QYD_API_ERR);
        codeMsgEnumMap.put("001X001X111", CodeMsgEnum.QYD_SEARCHUSERS_NULL);
        codeMsgEnumMap.put("001X001X112", CodeMsgEnum.QYD_SEARCHUSERS_NOT_EQUAL);
        codeMsgEnumMap.put("001X001X113", CodeMsgEnum.QYD_UP_LIMIT);
        codeMsgEnumMap.put("001X001X121", CodeMsgEnum.GANGLIAN_SECRET_UPDATE_ERR);
        codeMsgEnumMap.put("001X001X130", CodeMsgEnum.QYD_ORDER_FAILED);
        codeMsgEnumMap.put("001X001X131", CodeMsgEnum.QYD_ORDER_DOING);
        //OTP
        codeMsgEnumMap.put("ERR_TX_ID_MISSING", CodeMsgEnum.ERR_TX_ID_MISSING);
        codeMsgEnumMap.put("ERR_LOGGED_ID_MISSING", CodeMsgEnum.ERR_LOGGED_ID_MISSING);
        codeMsgEnumMap.put("ERR_TX_NOT_FOUND", CodeMsgEnum.ERR_TX_NOT_FOUND);
        codeMsgEnumMap.put("ERR_TX_NOT_PURCHASE", CodeMsgEnum.ERR_TX_NOT_PURCHASE);
        codeMsgEnumMap.put("ERR_TX_NOT_INITIALIZED_STATE", CodeMsgEnum.ERR_TX_NOT_INITIALIZED_STATE);
        codeMsgEnumMap.put("ERR_TX_NOT_PENDING_STATE", CodeMsgEnum.ERR_TX_NOT_PENDING_STATE);
        codeMsgEnumMap.put("ERR_OTP_MAX_COUNT_EXCEEDED", CodeMsgEnum.ERR_OTP_MAX_COUNT_EXCEEDED);
        codeMsgEnumMap.put("ERR_OTP_GET_AVAILABLE_FAILED", CodeMsgEnum.ERR_OTP_GET_AVAILABLE_FAILED);
        codeMsgEnumMap.put("ERR_OTP_MIN_REFRESH_TIME_NOT_PASSED", CodeMsgEnum.ERR_OTP_MIN_REFRESH_TIME_NOT_PASSED);
        codeMsgEnumMap.put("ERR_TX_UPDATE_FAILED", CodeMsgEnum.ERR_TX_UPDATE_FAILED);

    }

    public static Map<String, CodeMsgEnum> getCodeMsgEnumMap() {
        return codeMsgEnumMap;
    }
}
