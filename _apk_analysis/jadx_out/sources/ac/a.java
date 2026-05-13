package ac;

import com.mgs.carparking.dbtable.SpecialCollectionEntry;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.netbean.AdInfoEntry;
import com.mgs.carparking.netbean.AdSysConfEntry;
import com.mgs.carparking.netbean.BarrageListEntry;
import com.mgs.carparking.netbean.ChannnelFilterEntry;
import com.mgs.carparking.netbean.CollectionVideoEntry;
import com.mgs.carparking.netbean.ExtensionRecordEntry;
import com.mgs.carparking.netbean.ExtensionShareEntry;
import com.mgs.carparking.netbean.FeedbackRecordEntry;
import com.mgs.carparking.netbean.HomeMultipleEntry;
import com.mgs.carparking.netbean.HomeTitleEntry;
import com.mgs.carparking.netbean.HomeVideoPageEntry;
import com.mgs.carparking.netbean.HotNewSearchEntry;
import com.mgs.carparking.netbean.LoginUserEntity;
import com.mgs.carparking.netbean.MineUserInfo;
import com.mgs.carparking.netbean.OrderListEntry;
import com.mgs.carparking.netbean.RankTopicEntry;
import com.mgs.carparking.netbean.RankVideoEntry;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.RegisterEntity;
import com.mgs.carparking.netbean.SearchExtendEntry;
import com.mgs.carparking.netbean.ShortVideoSysConfEntry;
import com.mgs.carparking.netbean.TKBean;
import com.mgs.carparking.netbean.UploadFileEntry;
import com.mgs.carparking.netbean.UserDeviceEntity;
import com.mgs.carparking.netbean.VideoCollectionBeanEntry;
import com.mgs.carparking.netbean.VideoComment1Entry;
import com.mgs.carparking.netbean.VideoMoreEntry;
import com.mgs.carparking.netbean.VideoShareDataEntry;
import java.util.List;
import java.util.Map;
import me.goldze.mvvmhabit.http.BaseResponse;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import xl.t;

/* JADX INFO: compiled from: BrowserApiService.java */
/* JADX INFO: loaded from: classes9.dex */
public interface a {
    @FormUrlEncoded
    @POST("/api/data/action")
    t<BaseResponse<String>> A(@FieldMap Map<String, Object> map);

    @POST("/api/public/upload_file")
    @Multipart
    t<BaseResponse<UploadFileEntry>> B(@Part MultipartBody.Part part);

    @FormUrlEncoded
    @POST("/api/public/register")
    t<BaseResponse<RegisterEntity>> C(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/discuss/get_list_new")
    t<BaseResponse<VideoComment1Entry>> D(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/search/screen")
    t<BaseResponse<List<RecommandVideosEntity>>> E(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/short_play/list")
    t<BaseResponse<List<TKBean>>> F(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user_vod/get_list")
    t<BaseResponse<List<VideoCollectionBeanEntry>>> G(@FieldMap Map<String, Object> map);

    @POST("/api/search/hot_search")
    t<BaseResponse<List<HotNewSearchEntry>>> H();

    @FormUrlEncoded
    @POST("/api/public/init")
    t<BaseResponse<UserDeviceEntity>> I(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user_vod/remove")
    t<BaseResponse<String>> J(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/barrage/get_list")
    t<BaseResponse<List<BarrageListEntry>>> K(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user_vod/get_list")
    t<BaseResponse<List<VideoCollectionEntry>>> L(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/topic/vod_list")
    t<BaseResponse<RankVideoEntry>> M(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/invited/vod_share")
    t<BaseResponse<VideoShareDataEntry>> N(@FieldMap Map<String, Object> map);

    @POST("/api/invited/my_spread")
    t<BaseResponse<ExtensionShareEntry>> O();

    @POST("/api/order/get_list")
    t<BaseResponse<List<OrderListEntry>>> P();

    @FormUrlEncoded
    @POST("/api/public/get_sys_conf")
    t<BaseResponse<AdSysConfEntry>> Q(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user/down")
    t<BaseResponse<String>> R(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user/feedback_list")
    t<BaseResponse<List<FeedbackRecordEntry>>> S(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/public/get_sys_conf")
    t<BaseResponse<List<ShortVideoSysConfEntry>>> T(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user/update")
    t<BaseResponse<MineUserInfo>> U(@FieldMap Map<String, Object> map);

    @POST("/sunshine/user/insertSuggest")
    t<BaseResponse<String>> V(@Body RequestBody requestBody);

    @POST("/sunshine/video/showHomePageVideosForPage")
    t<BaseResponse<HomeVideoPageEntry>> W(@Body RequestBody requestBody);

    @POST("/sunshine/video/getSlideVideos")
    t<BaseResponse<List<RecommandVideosEntity>>> X(@Body RequestBody requestBody);

    @FormUrlEncoded
    @POST("/api/topic/vod_list")
    t<BaseResponse<VideoMoreEntry>> a(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/vod/info_new")
    t<BaseResponse<TKBean>> b(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user/game_ads_add_free_day")
    t<BaseResponse<String>> c(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user/info")
    t<BaseResponse<MineUserInfo>> d(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/channel/get_list")
    t<BaseResponse<List<HomeTitleEntry>>> e(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user_vod/get_list")
    t<BaseResponse<List<SpecialCollectionEntry>>> f(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user_vod/add")
    t<BaseResponse<CollectionVideoEntry>> g(@FieldMap Map<String, Object> map);

    @POST("/api/ad/get_list")
    t<BaseResponse<AdInfoEntry>> getAdInfo();

    @FormUrlEncoded
    @POST("/api/topic/list")
    t<BaseResponse<RankTopicEntry>> h(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/public/get_sys_conf")
    t<BaseResponse<String>> i(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/vod/info_new")
    t<BaseResponse<RecommandVideosEntity>> j(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user/game_ads_report")
    t<BaseResponse<String>> k(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/log/ad")
    t<BaseResponse<String>> l(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/channel/get_info")
    t<BaseResponse<List<HomeMultipleEntry>>> m(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/search/result")
    t<BaseResponse<List<RecommandVideosEntity>>> n(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/search/screen")
    t<BaseResponse<List<RecommandVideosEntity>>> o(@FieldMap Map<String, Object> map);

    @POST("/api/type/get_list")
    t<BaseResponse<List<ChannnelFilterEntry>>> p();

    @FormUrlEncoded
    @POST("/api/search/suggest")
    t<BaseResponse<List<SearchExtendEntry>>> q(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/topic/vod_list")
    t<BaseResponse<RankVideoEntry>> r(@FieldMap Map<String, Object> map);

    @POST("/api/user/my_invited")
    t<BaseResponse<ExtensionRecordEntry>> s();

    @FormUrlEncoded
    @POST("/api/search/recommend")
    t<BaseResponse<List<RecommandVideosEntity>>> t(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/public/login")
    t<BaseResponse<LoginUserEntity>> u(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/public/feedback")
    t<BaseResponse<String>> v(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/user_history/add")
    t<BaseResponse<String>> w(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/discuss/remove")
    t<BaseResponse<String>> x(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/barrage/add")
    t<BaseResponse<String>> y(@FieldMap Map<String, Object> map);

    @FormUrlEncoded
    @POST("/api/topic/change")
    t<BaseResponse<List<RecommandVideosEntity>>> z(@FieldMap Map<String, Object> map);
}
