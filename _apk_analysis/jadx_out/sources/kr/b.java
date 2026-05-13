package kr;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.gena.CancelReason;
import qr.f;
import qr.m;
import tr.d;

/* JADX INFO: compiled from: LocalGENASubscription.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b extends a<f> implements PropertyChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Logger f73563k = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<URL> f73564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<String, Long> f73565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<String, Long> f73566j;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public b(f fVar, Integer num, List<URL> list) throws Exception {
        super(fVar);
        this.f73565i = new HashMap();
        this.f73566j = new HashMap();
        S(num);
        f73563k.fine("Reading initial state of local service at subscription time");
        long time = new Date().getTime();
        this.f73562g.clear();
        Collection<d> currentState = H().q().getCurrentState();
        f73563k.finer("Got evented state variable values: " + currentState.size());
        for (d dVar : currentState) {
            this.f73562g.put(dVar.d().b(), (d<S>) dVar);
            if (f73563k.isLoggable(Level.FINEST)) {
                f73563k.finer("Read state variable value '" + dVar.d().b() + "': " + dVar.toString());
            }
            this.f73565i.put(dVar.d().b(), Long.valueOf(time));
            if (dVar.d().e()) {
                this.f73566j.put(dVar.d().b(), Long.valueOf(dVar.toString()));
            }
        }
        this.f73558c = "uuid:" + UUID.randomUUID();
        this.f73561f = new org.fourthline.cling.model.types.b(0L);
        this.f73564h = list;
    }

    public synchronized void L(CancelReason cancelReason) {
        try {
            H().q().a().removePropertyChangeListener(this);
        } catch (Exception e10) {
            f73563k.warning("Removal of local service property change listener failed: " + os.a.a(e10));
        }
        M(cancelReason);
    }

    public abstract void M(CancelReason cancelReason);

    public synchronized void N() {
        e();
    }

    public synchronized List<URL> O() {
        return this.f73564h;
    }

    public synchronized void P() {
        this.f73561f.d(true);
    }

    public synchronized Set<String> Q(long j10, Collection<d> collection) {
        HashSet hashSet;
        hashSet = new HashSet();
        for (d dVar : collection) {
            m mVarD = dVar.d();
            String strB = dVar.d().b();
            if (mVarD.a().a() == 0 && mVarD.a().b() == 0) {
                f73563k.finer("Variable is not moderated: " + mVarD);
            } else if (!this.f73565i.containsKey(strB)) {
                f73563k.finer("Variable is moderated but was never sent before: " + mVarD);
            } else if (mVarD.a().a() > 0 && j10 <= this.f73565i.get(strB).longValue() + ((long) mVarD.a().a())) {
                f73563k.finer("Excluding state variable with maximum rate: " + mVarD);
                hashSet.add(strB);
            } else if (mVarD.e() && this.f73566j.get(strB) != null) {
                long jLongValue = Long.valueOf(this.f73566j.get(strB).longValue()).longValue();
                long jLongValue2 = Long.valueOf(dVar.toString()).longValue();
                long jB = mVarD.a().b();
                if (jLongValue2 > jLongValue && jLongValue2 - jLongValue < jB) {
                    f73563k.finer("Excluding state variable with minimum delta: " + mVarD);
                    hashSet.add(strB);
                } else if (jLongValue2 < jLongValue && jLongValue - jLongValue2 < jB) {
                    f73563k.finer("Excluding state variable with minimum delta: " + mVarD);
                    hashSet.add(strB);
                }
            }
        }
        return hashSet;
    }

    public synchronized void R() {
        H().q().a().addPropertyChangeListener(this);
    }

    public synchronized void S(Integer num) {
        int iIntValue = num == null ? 1800 : num.intValue();
        this.f73559d = iIntValue;
        J(iIntValue);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.beans.PropertyChangeListener
    public synchronized void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getPropertyName().equals("_EventedStateVariables")) {
            f73563k.fine("Eventing triggered, getting state for subscription: " + I());
            long time = new Date().getTime();
            Collection<d> collection = (Collection) propertyChangeEvent.getNewValue();
            Set<String> setQ = Q(time, collection);
            this.f73562g.clear();
            for (d dVar : collection) {
                String strB = dVar.d().b();
                if (!setQ.contains(strB)) {
                    f73563k.fine("Adding state variable value to current values of event: " + dVar.d() + " = " + dVar);
                    this.f73562g.put(dVar.d().b(), (d<S>) dVar);
                    this.f73565i.put(strB, Long.valueOf(time));
                    if (dVar.d().e()) {
                        this.f73566j.put(strB, Long.valueOf(dVar.toString()));
                    }
                }
            }
            if (this.f73562g.size() > 0) {
                f73563k.fine("Propagating new state variable values to subscription: " + this);
                g();
            } else {
                f73563k.fine("No state variable values for event (all moderated out?), not triggering event");
            }
        }
    }
}
