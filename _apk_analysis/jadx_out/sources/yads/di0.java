package yads;

import android.net.Uri;
import com.yandex.div2.DivExtension;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class di0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kh0 f88858a;

    public /* synthetic */ di0() {
        this(new kh0());
    }

    public di0(kh0 kh0Var) {
        this.f88858a = kh0Var;
    }

    public final ci0 a(ah.e2 e2Var) {
        Object objM7534constructorimpl;
        this.f88858a.getClass();
        DivExtension divExtensionA = kh0.a(e2Var, "click");
        if (divExtensionA == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            JSONObject jSONObject = divExtensionA.f55241b;
            objM7534constructorimpl = Result.m7534constructorimpl(Uri.parse(jSONObject != null ? jSONObject.getString("url") : null));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        Uri uri = (Uri) objM7534constructorimpl;
        if (uri != null) {
            return new ci0(uri);
        }
        return null;
    }
}
