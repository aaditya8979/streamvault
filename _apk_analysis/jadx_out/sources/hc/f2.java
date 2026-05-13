package hc;

import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.SEARCHCONTENTVIDEOVIEWMODEL;

/* JADX INFO: compiled from: ITEMSEARCHEXTENDLISTVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class f2 extends np.c<SEARCHCONTENTVIDEOVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f63200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObservableField<SpannableString> f63201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pp.b f63202d;

    public f2(@NonNull SEARCHCONTENTVIDEOVIEWMODEL searchcontentvideoviewmodel, String str, String str2) {
        super(searchcontentvideoviewmodel);
        this.f63201c = new ObservableField<>();
        this.f63202d = new pp.b(new pp.a() { // from class: hc.e2
            @Override // pp.a
            public final void call() {
                this.f63186a.b();
            }
        });
        this.f63200b = str;
        this.f63201c.set(ed.e.w(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f75954a).f44129h.set(this.f63200b);
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f75954a).D.b();
    }
}
