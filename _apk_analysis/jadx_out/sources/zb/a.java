package zb;

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
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.Part;
import xl.t;

/* JADX INFO: compiled from: HttpDataSource.java */
/* JADX INFO: loaded from: classes8.dex */
public interface a {
    t<BaseResponse<String>> A(@FieldMap Map<String, Object> map);

    t<BaseResponse<UploadFileEntry>> B(@Part MultipartBody.Part part);

    t<BaseResponse<RegisterEntity>> C(@FieldMap Map<String, Object> map);

    t<BaseResponse<VideoComment1Entry>> D(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<RecommandVideosEntity>>> E(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<TKBean>>> F(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<VideoCollectionBeanEntry>>> G(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<HotNewSearchEntry>>> H();

    t<BaseResponse<UserDeviceEntity>> I(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> J(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<BarrageListEntry>>> K(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<VideoCollectionEntry>>> L(@FieldMap Map<String, Object> map);

    t<BaseResponse<RankVideoEntry>> M(@FieldMap Map<String, Object> map);

    t<BaseResponse<VideoShareDataEntry>> N(@FieldMap Map<String, Object> map);

    t<BaseResponse<ExtensionShareEntry>> O();

    t<BaseResponse<List<OrderListEntry>>> P();

    t<BaseResponse<AdSysConfEntry>> Q(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> R(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<FeedbackRecordEntry>>> S(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<ShortVideoSysConfEntry>>> T(@FieldMap Map<String, Object> map);

    t<BaseResponse<MineUserInfo>> U(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> V(@Body Map<String, Object> map);

    t<BaseResponse<HomeVideoPageEntry>> W(@Body Map<String, Object> map);

    t<BaseResponse<List<RecommandVideosEntity>>> X(@Body Map<String, Object> map);

    t<BaseResponse<String>> Y(@Body Map<String, Object> map);

    t<BaseResponse<VideoMoreEntry>> a(@FieldMap Map<String, Object> map);

    t<BaseResponse<TKBean>> b(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> c(@FieldMap Map<String, Object> map);

    t<BaseResponse<MineUserInfo>> d(@Body Map<String, Object> map);

    t<BaseResponse<List<HomeTitleEntry>>> e(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<SpecialCollectionEntry>>> f(@FieldMap Map<String, Object> map);

    t<BaseResponse<CollectionVideoEntry>> g(@FieldMap Map<String, Object> map);

    t<BaseResponse<AdInfoEntry>> getAdInfo();

    t<BaseResponse<RankTopicEntry>> h(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> i(@FieldMap Map<String, Object> map);

    t<BaseResponse<RecommandVideosEntity>> j(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> k(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> l(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<HomeMultipleEntry>>> m(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<RecommandVideosEntity>>> n(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<RecommandVideosEntity>>> o(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<ChannnelFilterEntry>>> p();

    t<BaseResponse<List<SearchExtendEntry>>> q(@FieldMap Map<String, Object> map);

    t<BaseResponse<RankVideoEntry>> r(@FieldMap Map<String, Object> map);

    t<BaseResponse<ExtensionRecordEntry>> s();

    t<BaseResponse<List<RecommandVideosEntity>>> t(@FieldMap Map<String, Object> map);

    t<BaseResponse<LoginUserEntity>> u(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> v(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> w(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> x(@FieldMap Map<String, Object> map);

    t<BaseResponse<String>> y(@FieldMap Map<String, Object> map);

    t<BaseResponse<List<RecommandVideosEntity>>> z(@FieldMap Map<String, Object> map);
}
