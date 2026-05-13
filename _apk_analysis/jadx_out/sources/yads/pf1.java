package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import yads.pf1;

/* JADX INFO: loaded from: classes2.dex */
public final class pf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv f93575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53 f93576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nf1 f93577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f93578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f93579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f93580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f93581g;

    public pf1(Looper looper, xv xvVar, nf1 nf1Var) {
        this(new CopyOnWriteArraySet(), looper, xvVar, nf1Var);
    }

    public pf1(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, xv xvVar, nf1 nf1Var) {
        this.f93575a = xvVar;
        this.f93578d = copyOnWriteArraySet;
        this.f93577c = nf1Var;
        this.f93579e = new ArrayDeque();
        this.f93580f = new ArrayDeque();
        this.f93576b = ((f53) xvVar).a(looper, new Handler.Callback() { // from class: bt.e8
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f6017b.a(message);
            }
        });
    }

    public static void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, mf1 mf1Var) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            of1 of1Var = (of1) it.next();
            if (!of1Var.f93210d) {
                if (i10 != -1) {
                    of1Var.f93208b.a(i10);
                }
                of1Var.f93209c = true;
                mf1Var.invoke(of1Var.f93207a);
            }
        }
    }

    public final void a() {
        if (this.f93580f.isEmpty()) {
            return;
        }
        if (!this.f93576b.f90680a.hasMessages(0)) {
            i53 i53Var = this.f93576b;
            i53Var.getClass();
            h53 h53VarA = i53.a();
            Message messageObtainMessage = i53Var.f90680a.obtainMessage(0);
            h53VarA.f90254a = messageObtainMessage;
            Handler handler = i53Var.f90680a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            h53VarA.a();
        }
        boolean z10 = !this.f93579e.isEmpty();
        this.f93579e.addAll(this.f93580f);
        this.f93580f.clear();
        if (z10) {
            return;
        }
        while (!this.f93579e.isEmpty()) {
            ((Runnable) this.f93579e.peekFirst()).run();
            this.f93579e.removeFirst();
        }
    }

    public final void a(final int i10, final mf1 mf1Var) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f93578d);
        this.f93580f.add(new Runnable() { // from class: bt.d8
            @Override // java.lang.Runnable
            public final void run() {
                pf1.a(copyOnWriteArraySet, i10, mf1Var);
            }
        });
    }

    public final boolean a(Message message) {
        for (of1 of1Var : this.f93578d) {
            nf1 nf1Var = this.f93577c;
            if (!of1Var.f93210d && of1Var.f93209c) {
                dw0 dw0VarA = of1Var.f93208b.a();
                of1Var.f93208b = new cw0();
                of1Var.f93209c = false;
                nf1Var.a(of1Var.f93207a, dw0VarA);
            }
            if (this.f93576b.f90680a.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }
}
