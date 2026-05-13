package sp;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.BindingAdapter;
import com.ironsource.C4089j8;
import dm.g;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ViewAdapter.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: sp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewAdapter.java */
    public class C1057a implements g<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pp.b f84464b;

        public C1057a(pp.b bVar) {
            this.f84464b = bVar;
        }

        @Override // dm.g
        public void accept(Object obj) throws Exception {
            pp.b bVar = this.f84464b;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    /* JADX INFO: compiled from: ViewAdapter.java */
    public class b implements g<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pp.b f84465b;

        public b(pp.b bVar) {
            this.f84465b = bVar;
        }

        @Override // dm.g
        public void accept(Object obj) throws Exception {
            pp.b bVar = this.f84465b;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    /* JADX INFO: compiled from: ViewAdapter.java */
    public class c implements g<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pp.b f84466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f84467c;

        public c(pp.b bVar, View view) {
            this.f84466b = bVar;
            this.f84467c = view;
        }

        @Override // dm.g
        public void accept(Object obj) throws Exception {
            pp.b bVar = this.f84466b;
            if (bVar != null) {
                bVar.c(this.f84467c);
            }
        }
    }

    @BindingAdapter(requireAll = false, value = {C4089j8.f32054k})
    public static void a(View view, Boolean bool) {
        if (bool.booleanValue()) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @BindingAdapter(requireAll = false, value = {"onClickCommand", "isThrottleFirst"})
    public static void b(View view, pp.b bVar, boolean z10) {
        if (z10) {
            w9.a.a(view).subscribe(new C1057a(bVar));
        } else {
            w9.a.a(view).throttleFirst(200L, TimeUnit.MILLISECONDS).subscribe(new b(bVar));
        }
    }

    @BindingAdapter(requireAll = false, value = {"onLongClickCommand"})
    public static void c(View view, pp.b bVar) {
        w9.a.b(view).subscribe(new c(bVar, view));
    }

    @BindingAdapter(requireAll = false, value = {"textMovement"})
    public static void d(TextView textView, Boolean bool) {
        if (bool.booleanValue()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
