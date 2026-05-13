package u2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import cn.v;
import cn.w0;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.internal.j0;
import java.util.Set;
import k2.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: OnDeviceProcessingManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lu2/c;", "", "", "d", "", "applicationId", "preferencesName", "Lbn/r;", "g", "Lcom/facebook/appevents/AppEvent;", "event", "e", "c", "", "b", "Ljava/util/Set;", "ALLOWED_IMPLICIT_EVENTS", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f85437a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<String> ALLOWED_IMPLICIT_EVENTS = w0.j("fb_mobile_purchase", "StartTrial", "Subscribe");

    public static final boolean d() {
        if (c3.a.d(c.class)) {
            return false;
        }
        try {
            if ((t.z(t.l()) || j0.U()) ? false : true) {
                return RemoteServiceWrapper.b();
            }
            return false;
        } catch (Throwable th2) {
            c3.a.b(th2, c.class);
            return false;
        }
    }

    public static final void e(@NotNull final String str, @NotNull final AppEvent appEvent) {
        if (c3.a.d(c.class)) {
            return;
        }
        try {
            p.k(str, "applicationId");
            p.k(appEvent, "event");
            if (f85437a.c(appEvent)) {
                t.t().execute(new Runnable() { // from class: u2.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.f(str, appEvent);
                    }
                });
            }
        } catch (Throwable th2) {
            c3.a.b(th2, c.class);
        }
    }

    public static final void f(String str, AppEvent appEvent) {
        if (c3.a.d(c.class)) {
            return;
        }
        try {
            p.k(str, "$applicationId");
            p.k(appEvent, "$event");
            RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.f15243a;
            RemoteServiceWrapper.c(str, v.e(appEvent));
        } catch (Throwable th2) {
            c3.a.b(th2, c.class);
        }
    }

    public static final void g(@Nullable final String str, @Nullable final String str2) {
        if (c3.a.d(c.class)) {
            return;
        }
        try {
            final Context contextL = t.l();
            if (contextL == null || str == null || str2 == null) {
                return;
            }
            t.t().execute(new Runnable() { // from class: u2.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.h(contextL, str2, str);
                }
            });
        } catch (Throwable th2) {
            c3.a.b(th2, c.class);
        }
    }

    public static final void h(Context context, String str, String str2) {
        if (c3.a.d(c.class)) {
            return;
        }
        try {
            p.k(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String strT = p.t(str2, "pingForOnDevice");
            if (sharedPreferences.getLong(strT, 0L) == 0) {
                RemoteServiceWrapper.e(str2);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(strT, System.currentTimeMillis());
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            c3.a.b(th2, c.class);
        }
    }

    public final boolean c(AppEvent event) {
        if (c3.a.d(this)) {
            return false;
        }
        try {
            return (event.isImplicit() ^ true) || (event.isImplicit() && ALLOWED_IMPLICIT_EVENTS.contains(event.getName()));
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return false;
        }
    }
}
