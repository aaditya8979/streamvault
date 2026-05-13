package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f32215b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0393a f32216a;

    /* JADX INFO: renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    public interface InterfaceC0393a {
        void a(Activity activity);

        void b(Activity activity);

        void onResume(Activity activity);
    }

    public static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(f32215b);
    }

    private void a(InterfaceC0393a interfaceC0393a) {
        if (interfaceC0393a != null) {
            interfaceC0393a.b(getActivity());
        }
    }

    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(f32215b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), f32215b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void b(InterfaceC0393a interfaceC0393a) {
        if (interfaceC0393a != null) {
            interfaceC0393a.onResume(getActivity());
        }
    }

    private void c(InterfaceC0393a interfaceC0393a) {
        if (interfaceC0393a != null) {
            interfaceC0393a.a(getActivity());
        }
    }

    public void d(InterfaceC0393a interfaceC0393a) {
        this.f32216a = interfaceC0393a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f32216a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f32216a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.f32216a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.f32216a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }
}
