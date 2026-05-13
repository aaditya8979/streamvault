package ac;

import com.google.gson.Gson;
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
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import xl.t;

/* JADX INFO: compiled from: HttpDataSourceImpl.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements zb.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile b f3714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static MediaType f3715c = MediaType.parse("application/json; charset=utf-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f3716a;

    public b(a aVar) {
        this.f3716a = aVar;
    }

    public static b Z(a aVar) {
        if (f3714b == null) {
            synchronized (b.class) {
                if (f3714b == null) {
                    f3714b = new b(aVar);
                }
            }
        }
        return f3714b;
    }

    @Override // zb.a
    public t<BaseResponse<String>> A(Map<String, Object> map) {
        return this.f3716a.A(map);
    }

    @Override // zb.a
    public t<BaseResponse<UploadFileEntry>> B(MultipartBody.Part part) {
        return this.f3716a.B(part);
    }

    @Override // zb.a
    public t<BaseResponse<RegisterEntity>> C(Map<String, Object> map) {
        return this.f3716a.C(map);
    }

    @Override // zb.a
    public t<BaseResponse<VideoComment1Entry>> D(Map<String, Object> map) {
        return this.f3716a.D(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<RecommandVideosEntity>>> E(Map<String, Object> map) {
        return this.f3716a.E(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<TKBean>>> F(Map<String, Object> map) {
        return this.f3716a.F(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<VideoCollectionBeanEntry>>> G(Map<String, Object> map) {
        return this.f3716a.G(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<HotNewSearchEntry>>> H() {
        return this.f3716a.H();
    }

    @Override // zb.a
    public t<BaseResponse<UserDeviceEntity>> I(Map<String, Object> map) {
        return this.f3716a.I(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> J(Map<String, Object> map) {
        return this.f3716a.J(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<BarrageListEntry>>> K(Map<String, Object> map) {
        return this.f3716a.K(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<VideoCollectionEntry>>> L(Map<String, Object> map) {
        return this.f3716a.L(map);
    }

    @Override // zb.a
    public t<BaseResponse<RankVideoEntry>> M(Map<String, Object> map) {
        return this.f3716a.M(map);
    }

    @Override // zb.a
    public t<BaseResponse<VideoShareDataEntry>> N(Map<String, Object> map) {
        return this.f3716a.N(map);
    }

    @Override // zb.a
    public t<BaseResponse<ExtensionShareEntry>> O() {
        return this.f3716a.O();
    }

    @Override // zb.a
    public t<BaseResponse<List<OrderListEntry>>> P() {
        return this.f3716a.P();
    }

    @Override // zb.a
    public t<BaseResponse<AdSysConfEntry>> Q(Map<String, Object> map) {
        return this.f3716a.Q(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> R(Map<String, Object> map) {
        return this.f3716a.R(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<FeedbackRecordEntry>>> S(Map<String, Object> map) {
        return this.f3716a.S(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<ShortVideoSysConfEntry>>> T(Map<String, Object> map) {
        return this.f3716a.T(map);
    }

    @Override // zb.a
    public t<BaseResponse<MineUserInfo>> U(Map<String, Object> map) {
        return this.f3716a.U(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> V(Map<String, Object> map) {
        return this.f3716a.J(map);
    }

    @Override // zb.a
    public t<BaseResponse<HomeVideoPageEntry>> W(Map<String, Object> map) {
        return this.f3716a.W(RequestBody.create(f3715c, new Gson().toJson(map)));
    }

    @Override // zb.a
    public t<BaseResponse<List<RecommandVideosEntity>>> X(Map<String, Object> map) {
        return this.f3716a.X(RequestBody.create(f3715c, new Gson().toJson(map)));
    }

    @Override // zb.a
    public t<BaseResponse<String>> Y(Map<String, Object> map) {
        return this.f3716a.V(RequestBody.create(f3715c, new Gson().toJson(map)));
    }

    @Override // zb.a
    public t<BaseResponse<VideoMoreEntry>> a(Map<String, Object> map) {
        return this.f3716a.a(map);
    }

    @Override // zb.a
    public t<BaseResponse<TKBean>> b(Map<String, Object> map) {
        return this.f3716a.b(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> c(Map<String, Object> map) {
        return this.f3716a.c(map);
    }

    @Override // zb.a
    public t<BaseResponse<MineUserInfo>> d(Map<String, Object> map) {
        return this.f3716a.d(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<HomeTitleEntry>>> e(Map<String, Object> map) {
        return this.f3716a.e(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<SpecialCollectionEntry>>> f(Map<String, Object> map) {
        return this.f3716a.f(map);
    }

    @Override // zb.a
    public t<BaseResponse<CollectionVideoEntry>> g(Map<String, Object> map) {
        return this.f3716a.g(map);
    }

    @Override // zb.a
    public t<BaseResponse<AdInfoEntry>> getAdInfo() {
        return this.f3716a.getAdInfo();
    }

    @Override // zb.a
    public t<BaseResponse<RankTopicEntry>> h(Map<String, Object> map) {
        return this.f3716a.h(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> i(Map<String, Object> map) {
        return this.f3716a.i(map);
    }

    @Override // zb.a
    public t<BaseResponse<RecommandVideosEntity>> j(Map<String, Object> map) {
        return this.f3716a.j(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> k(Map<String, Object> map) {
        return this.f3716a.k(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> l(Map<String, Object> map) {
        return this.f3716a.l(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<HomeMultipleEntry>>> m(Map<String, Object> map) {
        return this.f3716a.m(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<RecommandVideosEntity>>> n(Map<String, Object> map) {
        return this.f3716a.n(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<RecommandVideosEntity>>> o(Map<String, Object> map) {
        return this.f3716a.o(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<ChannnelFilterEntry>>> p() {
        return this.f3716a.p();
    }

    @Override // zb.a
    public t<BaseResponse<List<SearchExtendEntry>>> q(Map<String, Object> map) {
        return this.f3716a.q(map);
    }

    @Override // zb.a
    public t<BaseResponse<RankVideoEntry>> r(Map<String, Object> map) {
        return this.f3716a.r(map);
    }

    @Override // zb.a
    public t<BaseResponse<ExtensionRecordEntry>> s() {
        return this.f3716a.s();
    }

    @Override // zb.a
    public t<BaseResponse<List<RecommandVideosEntity>>> t(Map<String, Object> map) {
        return this.f3716a.t(map);
    }

    @Override // zb.a
    public t<BaseResponse<LoginUserEntity>> u(Map<String, Object> map) {
        return this.f3716a.u(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> v(Map<String, Object> map) {
        return this.f3716a.v(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> w(Map<String, Object> map) {
        return this.f3716a.w(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> x(Map<String, Object> map) {
        return this.f3716a.x(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> y(Map<String, Object> map) {
        return this.f3716a.y(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<RecommandVideosEntity>>> z(Map<String, Object> map) {
        return this.f3716a.z(map);
    }
}
