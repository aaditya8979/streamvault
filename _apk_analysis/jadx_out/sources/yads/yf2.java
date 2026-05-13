package yads;

import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yf2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ yf2[] f97114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kn.a f97115d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f97116b;

    static {
        yf2[] yf2VarArr = {new yf2("Flutter", 0, cn.v.e("io.flutter.embedding.android.FlutterActivity")), new yf2("ReactNative", 1, cn.v.e("com.facebook.react.bridge.ReactContext")), new yf2("Unity", 2, cn.w.p(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME, "com.unity3d.player.UnityPlayerActivity"))};
        f97114c = yf2VarArr;
        f97115d = kotlin.enums.a.a(yf2VarArr);
    }

    public yf2(String str, int i10, List list) {
        this.f97116b = list;
    }

    public static yf2 valueOf(String str) {
        return (yf2) Enum.valueOf(yf2.class, str);
    }

    public static yf2[] values() {
        return (yf2[]) f97114c.clone();
    }
}
