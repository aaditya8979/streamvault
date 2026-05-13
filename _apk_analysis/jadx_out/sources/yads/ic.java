package yads;

import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f90752a;

    public ic(at1 at1Var) {
        this.f90752a = at1Var;
    }

    public static jk a(JSONObject jSONObject) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("attributes"));
            objM7534constructorimpl = Result.m7534constructorimpl(new jk(jSONObject2.getString("campaignId"), jSONObject2.getString("bannerId"), jSONObject2.getString("placeId")));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        return (jk) objM7534constructorimpl;
    }
}
