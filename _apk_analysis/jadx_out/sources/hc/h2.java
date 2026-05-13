package hc;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.SEARCHCONTENTVIDEOVIEWMODEL;
import com.mgs.carparking.netbean.HotNewSearchEntry;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;

/* JADX INFO: compiled from: ITEMSEARCHHOTVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class h2 extends np.c<SEARCHCONTENTVIDEOVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HotNewSearchEntry f63214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f63215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pp.b f63216d;

    public h2(@NonNull SEARCHCONTENTVIDEOVIEWMODEL searchcontentvideoviewmodel, HotNewSearchEntry hotNewSearchEntry) {
        super(searchcontentvideoviewmodel);
        this.f63216d = new pp.b(new pp.a() { // from class: hc.g2
            @Override // pp.a
            public final void call() {
                this.f63208a.b();
            }
        });
        this.f63214b = hotNewSearchEntry;
        if (hotNewSearchEntry.getHot_type() == 1) {
            this.f63215c = ContextCompat.getDrawable(searchcontentvideoviewmodel.getApplication(), R.drawable.ic_search_hot);
        } else if (hotNewSearchEntry.getHot_type() == 2) {
            this.f63215c = ContextCompat.getDrawable(searchcontentvideoviewmodel.getApplication(), R.drawable.ic_search_new);
        } else if (hotNewSearchEntry.getHot_type() == 3) {
            this.f63215c = ContextCompat.getDrawable(searchcontentvideoviewmodel.getApplication(), R.drawable.ic_search_recommd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f63214b.getVod_id());
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f75954a).startActivity(VideoPlayDetailActivity.class, bundle);
    }
}
