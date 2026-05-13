package yads;

import android.content.Context;
import android.location.LocationManager;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class j53 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f91098c = new HashSet(cn.v.e("gps"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f91099d = new HashSet(cn.w.p("gps", "passive"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f91100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc2 f91101b;

    public /* synthetic */ j53(Context context, LocationManager locationManager) {
        this(locationManager, new gc2(context));
    }

    public j53(LocationManager locationManager, gc2 gc2Var) {
        this.f91100a = locationManager;
        this.f91101b = gc2Var;
    }
}
