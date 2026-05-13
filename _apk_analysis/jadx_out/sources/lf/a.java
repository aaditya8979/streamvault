package lf;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: compiled from: QueryInfoCallback.java */
/* JADX INFO: loaded from: classes4.dex */
public class a extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f73824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public df.a f73825c;

    public a(String str, df.a aVar) {
        this.f73824b = str;
        this.f73825c = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f73825c.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f73825c.a(this.f73824b, queryInfo.getQuery(), queryInfo);
    }
}
