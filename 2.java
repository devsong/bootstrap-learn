package com.elong.hotel.proxy.javaorder.consts;

/**
 * 查询原始订单 字段常量
 * 
 * @author zouyufei
 *
 */
public interface OriginalOrderFieldsConst {

    /**
     * 入库
     */
    String FIELDS_FOR_STORAGE = "status,hotelId,payment,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,otaType,orderFlag,supplierId,supplierType,supplierOtaType,supplierName,promotion,isUrgentVerify,modifyName,roomNo,groupId,additionalStatus,confirmNo,guestName,proxy,createTime,hotelName,gradeId,sumPrice,sumCost,confirmMethod,contactPhone,cardNo,contactMobile,orderFrom,mHotelName,ratePlanId,distanceFromHotelWhenBooking,cityId,modifyTime,notesToHotel,notesToGuest,notesToElong,cooperationOrderId,fullRoomRate,cooperationType,businessSystemId,appClientType,pmsConfirmTime,orderKeyValues,roomCount,roomNightsCount,isAcceptDcOfflineProcess,star,starType,roomTypeName,isConfirmed,baseRuleInfo,failureFlag,fraudReasonIDs,tag,status1,additionalStatusI,latestPayTime,resaleType,fraudActionType,fraudStatus,paymentDetailType,paymentDetailProcessType,paymentDetailProcessStatus,payAmount";

    /**
     * 确认ivr
     */
    String FIELDS_FOR_CONFIRMIVR = "status,hotelId,payment,checkInDate,roomCount,mRoomTypeName,checkOutDate,earlyCheckInTime,lateCheckInTime,additionalStatus,guestName,guestSex,hotelName,mHotelName,roomNightStayDate,roomNightIsSpecial,roomNightCost,roomNightSalePrice,roomNightRealSalePrice,roomNightRealCost,roomNightBreakfastCount,notesToHotel,notesToElong,otaType,originFrom,cooperationType,supplierOtaType";

    /**
     * 初拒调用查询字段
     */
    String FIELDS_FOR_FIRST_REFUSE = "hotelId,hotelName,mHotelId,mHotelName,cityId,cityName,provinceId,provinceName,cooperationType,createTime,modifyTime,roomCount,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,additionalStatus,additionalStatusI,notesToHotel,notesToGuest,notesToElong,roomNightsCount,orderFrom,createName,modifyName,roomTypeId,roomTypeName,ratePlanId,ratePlanName,mRoomTypeId,supplierId,supplierName,supplierType,roomNightStayDate,roomNightInventoryId,roomNightInventoryType";

    /**
     * mis确认
     */
    String FIELDS_FOR_MISCONFIRM = "status,hotelId,payment,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,otaType,orderFlag,supplierId,supplierType,supplierOtaType,supplierName,promotion,isUrgentVerify,modifyName,roomNo,groupId,additionalStatus,confirmNo,guestName,proxy,createTime,hotelName,gradeId,sumPrice,sumCost,confirmMethod,contactPhone,cardNo,contactMobile,orderFrom,mHotelName,ratePlanId,distanceFromHotelWhenBooking,cityId,modifyTime,notesToHotel,notesToGuest,notesToElong";

    /**
     * 待处理／暂缓
     */
    String FIELDS_FOR_PENDING = "hotelId,cooperationType,additionalStatus,confirmNo,roomTypeName,roomCount,payment,guestName,roomNightBreakfastCount,notesToHotel,notesToGuest,notesToElong,sumPrice,sumCost,cardNo,gradeId,contactPhone,contactMobile,createName,orderKeyValues,createTime,currencyCode,roomNo,roomNightInventoryType,ratePlanId,hotelfax,roomNightRealCost,roomNightRealSalePrice,status,roomNightStayDate,mHotelId,roomTypeId,checkInDate,checkOutDate,cooperationOrderId,proxy,baseRuleInfo,orderFlag,originFrom,otaType,businessSystemId,ctripSupplierType,orderFlagsForProduct";

    /**
     * 联单，重单
     */
    String REPEAT_AND_LINKED = "hotelName,orderFrom,status,additionalStatus,payment,guestName,roomCount,checkInDate,checkOutDate,roomTypeName,mRoomTypeName,proxy";

    /**
     * 发短信
     */
    String SEND_MSG = "cardNo,contactPhone,contactMobile,contactName,proxy,businessSystemId,appClientType,orderFrom,status,roomTypeName,hotelName,checkInDate,checkOutDate,guestName,payment,additionalStatus";

    /**
     * 关房
     */
    String CLOSE_ROOM = "roomTypeId,hotelId,ratePlanId";

    String FIELDS_FOR_NOTES = "notesToElong,notesToHotel,actionStrExt1,actionType";

    /**
     * 无房风险订单
     */
    String NO_ROOM_ORDER = "supplierOtaType,cooperationType,otaType,status,checkInDate,roomTypeName,roomCount";

    /**
     * 外呼
     */
    String NO_ROOM_ORDER_IVR = "hotelId,roomTypeId,roomTypeName,ratePlanId,payment,status,notesToHotel,cooperationOrderId,guestName,roomCount,mRoomTypeName,earlyCheckInTime,lateCheckInTime,checkInDate,checkOutDate,supplierOtaType,cooperationType,otaType,additionalStatus,additionalStatusI,notesToElong,roomNightStayDate,roomNightIsSpecial,roomNightCost,roomNightSalePrice,roomNightRealSalePrice,roomNightRealCost,roomNightBreakfastCount";

    /**
     * 代理订单 确认方式 短信确认 还是email 或不允许确认
     */
    String ORDER_CONFIRMMETHOD = "confirmMethod,businessSystemId,appClientType,orderFrom,otaType,contactPhone,contactMobile,contactName,cardNo,proxy";

    /**
     * 确认后推翻，强制担保原订单状态
     */
    String OVERTHROW_STATUS = "status,notesToElong";

    /**
     * 终拒/员工待处理查询
     */
    String SEARCH_FOR_EXAM = "status,cardNo,hotelId,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,payment,payAmount,otaType,isUrgentVerify,additionalStatus,guestName,proxy,hotelName,gradeId,sumPrice,sumCost,contactPhone,contactMobile,orderFrom,ratePlanId,notesToHotel,notesToGuest,notesToElong,businessSystemId,roomCount,roomNightsCount,roomTypeId,roomTypeName,roomNightStayDate,roomNightIsSpecial,roomNightCost,roomNightSalePrice,roomNightRealSalePrice,roomNightRealCost,roomNightBreakfastCount,exchangedSumPrice,provinceId,orderKeyValues,additionalStatusI,promotionSettlementType,cityName,promotionChannelCode,tcOrderId,tcSubOrderId,tcCardNo,baiduLatitude,baiduLongitude,googleLongitude,googleLatitude,cooperationOrderId,baseRuleInfo,roomNightCurrencyCode,roomNightInventoryType,isConfirmed,cooperationType,supplierOtaType,orderFlagsForMis,ctripSupplierType";

    /**
     * 终拒查询备注信息
     */
    String SEARCH_NOTES_FOR_EXAM = "notesToElong,notesToHotel";

    /**
     * 取消待处理查询
     */
    String SEARCH_FOR_CANCEL_PENDING = "hotelId,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,otaType,guestName,additionalStatus,roomCount,roomTypeName,roomNightSalePrice,roomNightRealCost,roomNightBreakfastCount,roomNightCurrencyCode,status1,supplierId,supplierType,supplierOtaType,supplierName,orderKeyValues,additionalStatusI,paymentFlowType,ratePlanId,roomTypeId,cooperationType,ctripSupplierType,compensationToHotel,notesToElong,notesToHotel";

    /**
     * 新单待处理查询
     */
    String SEARCH_FOR_SPECIAL_PENDING = "supplierId,supplierType,supplierName,notesToElong,notesToHotel,cardNo,hotelName,checkInDate,checkOutDate,earlyCheckInTime,lateCheckInTime,guestName,roomCount,roomTypeName,roomNightSalePrice,roomNightBreakfastCount,roomNightCurrencyCode,proxy,contactMobile,ctripSupplierType,otaType,supplierOtaType,orderKeyValues,additionalStatus,additionalStatusI";

    /**
     * 新单/恶意单关联查询
     */
    String MALICIOUS_RELATION_ORDER = "additionalStatus,payment,orderFlag,baseRuleInfo";

    /**
     * 新单/恶意单状态查询
     */
    String SEARCH_FOR_SPECIAL_OUTSTIRAGE = "status";

    /**
     * 拒单统计查询
     */
    String SEARCH_FOR_REJECTION_TOTAL = "hotelId,mHotelId,mHotelName,cityId,cityName,provinceId,provinceName,supplierId,supplierType,supplierName,ctripSupplierType,otaType,cooperationType,createTime,hcDirectSign";

    /**
     * 权益云订单字段
     */
    String FIELDS_ENTITLEMENT = "status,isConfirmed,checkInDate,checkOutDate,entitlementPromotionId,entitlementTagId,entitlementStatus,entitlementIsDayRelated,entitlementDay,entitlementRoomNumber,entitlementAmount,entitlementMileage";

    /**
     * 获取承诺时间
     */
    String FIELDS_FOR_GET_PROMISE_TIME = "otaType,pmsConfirmTime";

    /**
     * 催支付待处理查询
     */
    String FIELDS_FOR_URGEPAYMENT_PENDING_LIST = "hotelId,hotelName,checkInDate,checkOutDate,roomCount,createTime,contactName,contactMobile,mRoomTypeName";

    /**
     * 催支付待处理查询
     */
    String FIELDS_FOR_URGEPAYMENT_PENDING_HOTELNAME = "hotelName";

    /**
     * 催支付兜底
     */
    String FIELDS_FOR_URGE_PAYMENT_TASK = "status,payment,checkInDate,checkOutDate,fraudActionType,fraudStatus,paymentDetailType,paymentDetailProcessType,paymentDetailProcessStatus";

    /**
     * 切客追单待处理查询
     */
    String SEARCH_FOR_RECOVERORDER = "notesToElong,notesToHotel,additionalStatusI,otaType,supplierOtaType,ctripSupplierType";
}