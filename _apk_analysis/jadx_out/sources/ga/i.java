package ga;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;

/* JADX INFO: compiled from: ForegroundServiceConfig.java */
/* JADX INFO: loaded from: classes6.dex */
@TargetApi(26)
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f62278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f62279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Notification f62280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f62281e;

    /* JADX INFO: compiled from: ForegroundServiceConfig.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f62282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f62283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f62284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Notification f62285d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f62286e;

        public i a() {
            i iVar = new i();
            String str = this.f62283b;
            if (str == null) {
                str = "filedownloader_channel";
            }
            iVar.i(str);
            String str2 = this.f62284c;
            if (str2 == null) {
                str2 = "Filedownloader";
            }
            iVar.j(str2);
            int i10 = this.f62282a;
            if (i10 == 0) {
                i10 = R.drawable.arrow_down_float;
            }
            iVar.k(i10);
            iVar.g(this.f62286e);
            iVar.h(this.f62285d);
            return iVar;
        }

        public b b(boolean z10) {
            this.f62286e = z10;
            return this;
        }
    }

    public i() {
    }

    public final Notification a(Context context) {
        String string = context.getString(com.yk.e.core.R.string.default_filedownloader_notification_title);
        String string2 = context.getString(com.yk.e.core.R.string.default_filedownloader_notification_content);
        Notification.Builder builder = new Notification.Builder(context, this.f62278b);
        builder.setContentTitle(string).setContentText(string2).setSmallIcon(R.drawable.arrow_down_float);
        return builder.build();
    }

    public Notification b(Context context) {
        if (this.f62280d == null) {
            if (ia.d.f64033a) {
                ia.d.a(this, "build default notification", new Object[0]);
            }
            this.f62280d = a(context);
        }
        return this.f62280d;
    }

    public String c() {
        return this.f62278b;
    }

    public String d() {
        return this.f62279c;
    }

    public int e() {
        return this.f62277a;
    }

    public boolean f() {
        return this.f62281e;
    }

    public void g(boolean z10) {
        this.f62281e = z10;
    }

    public void h(Notification notification) {
        this.f62280d = notification;
    }

    public void i(String str) {
        this.f62278b = str;
    }

    public void j(String str) {
        this.f62279c = str;
    }

    public void k(int i10) {
        this.f62277a = i10;
    }

    public String toString() {
        return "ForegroundServiceConfig{notificationId=" + this.f62277a + ", notificationChannelId='" + this.f62278b + "', notificationChannelName='" + this.f62279c + "', notification=" + this.f62280d + ", needRecreateChannelId=" + this.f62281e + '}';
    }
}
