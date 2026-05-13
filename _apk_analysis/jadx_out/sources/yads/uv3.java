package yads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uv3 extends gw3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f95855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f95856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f95857e;

    public uv3(fw3 fw3Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(fw3Var);
        this.f95855c = new HashSet(hashSet);
        this.f95856d = jSONObject;
        this.f95857e = j10;
    }
}
