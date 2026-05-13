package yb;

import androidx.annotation.NonNull;
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
import xl.t;

/* JADX INFO: compiled from: AppRepository.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends tp.a implements zb.a, zb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f97850c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zb.a f97851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zb.b f97852b;

    public a(@NonNull zb.a aVar, @NonNull zb.b bVar) {
        this.f97851a = aVar;
        this.f97852b = bVar;
    }

    public static a a0(zb.a aVar, zb.b bVar) {
        if (f97850c == null) {
            synchronized (a.class) {
                if (f97850c == null) {
                    f97850c = new a(aVar, bVar);
                }
            }
        }
        return f97850c;
    }

    @Override // zb.a
    public t<BaseResponse<String>> A(Map<String, Object> map) {
        return this.f97851a.A(map);
    }

    @Override // zb.a
    public t<BaseResponse<UploadFileEntry>> B(MultipartBody.Part part) {
        return this.f97851a.B(part);
    }

    @Override // zb.a
    public t<BaseResponse<RegisterEntity>> C(Map<String, Object> map) {
        return this.f97851a.C(map);
    }

    @Override // zb.a
    public t<BaseResponse<VideoComment1Entry>> D(Map<String, Object> map) {
        return this.f97851a.D(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<RecommandVideosEntity>>> E(Map<String, Object> map) {
        return this.f97851a.E(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<TKBean>>> F(Map<String, Object> map) {
        return this.f97851a.F(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<VideoCollectionBeanEntry>>> G(Map<String, Object> map) {
        return this.f97851a.G(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<HotNewSearchEntry>>> H() {
        return this.f97851a.H();
    }

    @Override // zb.a
    public t<BaseResponse<UserDeviceEntity>> I(Map<String, Object> map) {
        return this.f97851a.I(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> J(Map<String, Object> map) {
        return this.f97851a.J(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<BarrageListEntry>>> K(Map<String, Object> map) {
        return this.f97851a.K(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<VideoCollectionEntry>>> L(Map<String, Object> map) {
        return this.f97851a.L(map);
    }

    @Override // zb.a
    public t<BaseResponse<RankVideoEntry>> M(Map<String, Object> map) {
        return this.f97851a.M(map);
    }

    @Override // zb.a
    public t<BaseResponse<VideoShareDataEntry>> N(Map<String, Object> map) {
        return this.f97851a.N(map);
    }

    @Override // zb.a
    public t<BaseResponse<ExtensionShareEntry>> O() {
        return this.f97851a.O();
    }

    @Override // zb.a
    public t<BaseResponse<List<OrderListEntry>>> P() {
        return this.f97851a.P();
    }

    @Override // zb.a
    public t<BaseResponse<AdSysConfEntry>> Q(Map<String, Object> map) {
        return this.f97851a.Q(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> R(Map<String, Object> map) {
        return this.f97851a.R(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<FeedbackRecordEntry>>> S(Map<String, Object> map) {
        return this.f97851a.S(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<ShortVideoSysConfEntry>>> T(Map<String, Object> map) {
        return this.f97851a.T(map);
    }

    @Override // zb.a
    public t<BaseResponse<MineUserInfo>> U(Map<String, Object> map) {
        return this.f97851a.U(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> V(Map<String, Object> map) {
        return this.f97851a.V(map);
    }

    @Override // zb.a
    public t<BaseResponse<HomeVideoPageEntry>> W(Map<String, Object> map) {
        return this.f97851a.W(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<RecommandVideosEntity>>> X(Map<String, Object> map) {
        return this.f97851a.X(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> Y(Map<String, Object> map) {
        return this.f97851a.Y(map);
    }

    @Override // zb.a
    public t<BaseResponse<VideoMoreEntry>> a(Map<String, Object> map) {
        return this.f97851a.a(map);
    }

    @Override // zb.a
    public t<BaseResponse<TKBean>> b(Map<String, Object> map) {
        return this.f97851a.b(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> c(Map<String, Object> map) {
        return this.f97851a.c(map);
    }

    @Override // zb.a
    public t<BaseResponse<MineUserInfo>> d(Map<String, Object> map) {
        return this.f97851a.d(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<HomeTitleEntry>>> e(Map<String, Object> map) {
        return this.f97851a.e(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<SpecialCollectionEntry>>> f(Map<String, Object> map) {
        return this.f97851a.f(map);
    }

    @Override // zb.a
    public t<BaseResponse<CollectionVideoEntry>> g(Map<String, Object> map) {
        return this.f97851a.g(map);
    }

    @Override // zb.a
    public t<BaseResponse<AdInfoEntry>> getAdInfo() {
        return this.f97851a.getAdInfo();
    }

    @Override // zb.a
    public t<BaseResponse<RankTopicEntry>> h(Map<String, Object> map) {
        return this.f97851a.h(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> i(Map<String, Object> map) {
        return this.f97851a.i(map);
    }

    @Override // zb.a
    public t<BaseResponse<RecommandVideosEntity>> j(Map<String, Object> map) {
        return this.f97851a.j(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> k(Map<String, Object> map) {
        return this.f97851a.k(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> l(Map<String, Object> map) {
        return this.f97851a.l(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<HomeMultipleEntry>>> m(Map<String, Object> map) {
        return this.f97851a.m(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<RecommandVideosEntity>>> n(Map<String, Object> map) {
        return this.f97851a.n(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<RecommandVideosEntity>>> o(Map<String, Object> map) {
        return this.f97851a.o(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<ChannnelFilterEntry>>> p() {
        return this.f97851a.p();
    }

    @Override // zb.a
    public t<BaseResponse<List<SearchExtendEntry>>> q(Map<String, Object> map) {
        return this.f97851a.q(map);
    }

    @Override // zb.a
    public t<BaseResponse<RankVideoEntry>> r(Map<String, Object> map) {
        return this.f97851a.r(map);
    }

    @Override // zb.a
    public t<BaseResponse<ExtensionRecordEntry>> s() {
        return this.f97851a.s();
    }

    @Override // zb.a
    public t<BaseResponse<List<RecommandVideosEntity>>> t(Map<String, Object> map) {
        return this.f97851a.t(map);
    }

    @Override // zb.a
    public t<BaseResponse<LoginUserEntity>> u(Map<String, Object> map) {
        return this.f97851a.u(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> v(Map<String, Object> map) {
        return this.f97851a.v(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> w(Map<String, Object> map) {
        return this.f97851a.w(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> x(Map<String, Object> map) {
        return this.f97851a.x(map);
    }

    @Override // zb.a
    public t<BaseResponse<String>> y(Map<String, Object> map) {
        return this.f97851a.y(map);
    }

    @Override // zb.a
    public t<BaseResponse<List<RecommandVideosEntity>>> z(Map<String, Object> map) {
        return this.f97851a.z(map);
    }
}
