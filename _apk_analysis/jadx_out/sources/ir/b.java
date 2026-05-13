package ir;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: DefaultServiceManager.java */
/* JADX INFO: loaded from: classes.dex */
public class b<T> implements j<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Logger f71757f = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qr.f<T> f71758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<T> f71759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f71760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f71761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PropertyChangeSupport f71762e;

    /* JADX INFO: compiled from: DefaultServiceManager.java */
    public class a implements PropertyChangeListener {
        public a() {
        }

        @Override // java.beans.PropertyChangeListener
        public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
            b.f71757f.finer("Property change event on local service: " + propertyChangeEvent.getPropertyName());
            if (propertyChangeEvent.getPropertyName().equals("_EventedStateVariables")) {
                return;
            }
            String[] strArrA = f.a(propertyChangeEvent.getPropertyName());
            b.f71757f.fine("Changed variable names: " + Arrays.toString(strArrA));
            try {
                Collection<tr.d> collectionG = b.this.g(strArrA);
                if (collectionG.isEmpty()) {
                    return;
                }
                b.this.a().firePropertyChange("_EventedStateVariables", (Object) null, collectionG);
            } catch (Exception e10) {
                b.f71757f.log(Level.SEVERE, "Error reading state of service after state variable update event: " + os.a.a(e10), (Throwable) e10);
            }
        }
    }

    public b(qr.f<T> fVar) {
        this(fVar, null);
    }

    public b(qr.f<T> fVar, Class<T> cls) {
        this.f71760c = new ReentrantLock(true);
        this.f71758a = fVar;
        this.f71759b = cls;
    }

    @Override // ir.j
    public PropertyChangeSupport a() {
        k();
        try {
            if (this.f71762e == null) {
                j();
            }
            return this.f71762e;
        } finally {
            m();
        }
    }

    @Override // ir.j
    public void b(ir.a<T> aVar) throws Exception {
        k();
        try {
            aVar.a(this);
        } finally {
            m();
        }
    }

    public PropertyChangeListener d(T t10) throws Exception {
        return new a();
    }

    public PropertyChangeSupport e(T t10) throws Exception {
        Method methodF = os.d.f(t10.getClass(), "propertyChangeSupport");
        if (methodF == null || !PropertyChangeSupport.class.isAssignableFrom(methodF.getReturnType())) {
            f71757f.fine("Creating new PropertyChangeSupport for service implementation: " + t10.getClass().getName());
            return new PropertyChangeSupport(t10);
        }
        f71757f.fine("Service implementation instance offers PropertyChangeSupport, using that: " + t10.getClass().getName());
        return (PropertyChangeSupport) methodF.invoke(t10, new Object[0]);
    }

    public T f() throws Exception {
        Class<T> cls = this.f71759b;
        if (cls == null) {
            throw new IllegalStateException("Subclass has to provide service class or override createServiceInstance()");
        }
        try {
            return cls.getConstructor(qr.f.class).newInstance(i());
        } catch (NoSuchMethodException unused) {
            f71757f.fine("Creating new service implementation instance with no-arg constructor: " + this.f71759b.getName());
            return this.f71759b.newInstance();
        }
    }

    public Collection<tr.d> g(String[] strArr) throws Exception {
        k();
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                String strTrim = str.trim();
                qr.m<qr.f> mVarH = i().h(strTrim);
                if (mVarH == null || !mVarH.a().c()) {
                    f71757f.fine("Ignoring unknown or non-evented state variable: " + strTrim);
                } else {
                    tr.c cVarO = i().o(mVarH);
                    if (cVarO == null) {
                        f71757f.warning("Ignoring evented state variable without accessor: " + strTrim);
                    } else {
                        arrayList.add(cVarO.c(mVarH, getImplementation()));
                    }
                }
            }
            return arrayList;
        } finally {
            m();
        }
    }

    @Override // ir.j
    public Collection<tr.d> getCurrentState() throws Exception {
        k();
        try {
            Collection<tr.d> collectionL = l();
            if (collectionL != null) {
                f71757f.fine("Obtained initial state variable values for event, skipping individual state variable accessors");
                return collectionL;
            }
            ArrayList arrayList = new ArrayList();
            for (qr.m<qr.f> mVar : i().i()) {
                if (mVar.a().c()) {
                    tr.c cVarO = i().o(mVar);
                    if (cVarO == null) {
                        throw new IllegalStateException("No accessor for evented state variable");
                    }
                    arrayList.add(cVarO.c(mVar, getImplementation()));
                }
            }
            return arrayList;
        } finally {
            m();
        }
    }

    @Override // ir.j
    public T getImplementation() {
        k();
        try {
            if (this.f71761d == null) {
                j();
            }
            return this.f71761d;
        } finally {
            m();
        }
    }

    public int h() {
        return 500;
    }

    public qr.f<T> i() {
        return this.f71758a;
    }

    public void j() {
        f71757f.fine("No service implementation instance available, initializing...");
        try {
            T tF = f();
            this.f71761d = tF;
            PropertyChangeSupport propertyChangeSupportE = e(tF);
            this.f71762e = propertyChangeSupportE;
            propertyChangeSupportE.addPropertyChangeListener(d(this.f71761d));
        } catch (Exception e10) {
            throw new RuntimeException("Could not initialize implementation: " + e10, e10);
        }
    }

    public void k() {
        try {
            if (this.f71760c.tryLock(h(), TimeUnit.MILLISECONDS)) {
                if (f71757f.isLoggable(Level.FINEST)) {
                    f71757f.finest("Acquired lock");
                }
            } else {
                throw new RuntimeException("Failed to acquire lock in milliseconds: " + h());
            }
        } catch (InterruptedException e10) {
            throw new RuntimeException("Failed to acquire lock:" + e10);
        }
    }

    public Collection<tr.d> l() throws Exception {
        return null;
    }

    public void m() {
        if (f71757f.isLoggable(Level.FINEST)) {
            f71757f.finest("Releasing lock");
        }
        this.f71760c.unlock();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") Implementation: " + this.f71761d;
    }
}
