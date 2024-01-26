package com.huawei.model

/**
 * @author pengshilin
 * @date 2023/3/5 13:26
 */
case class PageLog(

                    mid :String,
                    user_id:String,
                    province_id:String,
                    channel:String,
                    is_new:String,
                    model:String,
                    operate_system:String,
                    version_code:String,
                    page_id:String ,
                    last_page_id:String,
                    page_item:String,
                    page_item_type:String,
                    during_time:Long,
                    ts:Long
                  ) {

}
