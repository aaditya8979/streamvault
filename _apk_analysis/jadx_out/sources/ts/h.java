package ts;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.event.EventRecordingLogger;
import org.slf4j.event.Level;
import org.slf4j.helpers.NOPLogger;

/* JADX INFO: compiled from: SubstituteLogger.java */
/* JADX INFO: loaded from: classes3.dex */
public class h implements rs.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile rs.c f85407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f85408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f85409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EventRecordingLogger f85410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Queue<ss.c> f85411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f85412h;

    public h(String str, Queue<ss.c> queue, boolean z10) {
        this.f85406b = str;
        this.f85411g = queue;
        this.f85412h = z10;
    }

    public rs.c a() {
        return this.f85407c != null ? this.f85407c : this.f85412h ? NOPLogger.NOP_LOGGER : b();
    }

    public final rs.c b() {
        if (this.f85410f == null) {
            this.f85410f = new EventRecordingLogger(this, this.f85411g);
        }
        return this.f85410f;
    }

    public String c() {
        return this.f85406b;
    }

    public boolean d() {
        Boolean bool = this.f85408d;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f85409e = this.f85407c.getClass().getMethod(CreativeInfo.f52469an, ss.b.class);
            this.f85408d = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f85408d = Boolean.FALSE;
        }
        return this.f85408d.booleanValue();
    }

    @Override // rs.c
    public void debug(String str, Throwable th2) {
        a().debug(str, th2);
    }

    public boolean e() {
        return this.f85407c instanceof NOPLogger;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f85406b.equals(((h) obj).f85406b);
    }

    public boolean f() {
        return this.f85407c == null;
    }

    public void g(ss.b bVar) {
        if (d()) {
            try {
                this.f85409e.invoke(this.f85407c, bVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public void h(rs.c cVar) {
        this.f85407c = cVar;
    }

    public int hashCode() {
        return this.f85406b.hashCode();
    }

    @Override // rs.c
    public boolean isDebugEnabled() {
        return a().isDebugEnabled();
    }

    @Override // rs.c
    public boolean isEnabledForLevel(Level level) {
        return a().isEnabledForLevel(level);
    }

    @Override // rs.c
    public boolean isErrorEnabled() {
        return a().isErrorEnabled();
    }

    @Override // rs.c
    public boolean isInfoEnabled() {
        return a().isInfoEnabled();
    }

    @Override // rs.c
    public boolean isTraceEnabled() {
        return a().isTraceEnabled();
    }

    @Override // rs.c
    public boolean isWarnEnabled() {
        return a().isWarnEnabled();
    }

    @Override // rs.c
    public us.b makeLoggingEventBuilder(Level level) {
        return a().makeLoggingEventBuilder(level);
    }

    @Override // rs.c
    public void trace(String str) {
        a().trace(str);
    }

    @Override // rs.c
    public void warn(String str) {
        a().warn(str);
    }
}
