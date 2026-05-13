package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer.trackselection.b;
import com.mgs.carparking.netbean.DetailsetAudioandSubtitleEntry;
import com.mgs.carparking.widgets.dialog.DetailsetAudioandSubtitleAdapter;
import ed.t;
import java.util.ArrayList;
import java.util.List;
import zp.o;

/* JADX INFO: compiled from: DetailSetAudioPop.java */
/* JADX INFO: loaded from: classes8.dex */
public class b extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f45362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f45363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DetailsetAudioandSubtitleAdapter f45364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DetailsetAudioandSubtitleAdapter f45365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f45366e;

    /* JADX INFO: compiled from: DetailSetAudioPop.java */
    public class a implements DetailsetAudioandSubtitleAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f45367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w.a f45368b;

        public a(List list, w.a aVar) {
            this.f45367a = list;
            this.f45368b = aVar;
        }

        @Override // com.mgs.carparking.widgets.dialog.DetailsetAudioandSubtitleAdapter.c
        public void a(int i10) {
            b.this.f45364c.g(this.f45367a, i10);
            DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) this.f45368b.D().Q();
            defaultTrackSelector.L(defaultTrackSelector.v().g().i(((DetailsetAudioandSubtitleEntry) this.f45367a.get(i10)).getName()));
            c cVar = b.this.f45366e;
            if (cVar != null) {
                cVar.b(((DetailsetAudioandSubtitleEntry) this.f45367a.get(i10)).getName());
            }
        }
    }

    /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DetailSetAudioPop.java */
    public class C0544b implements DetailsetAudioandSubtitleAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f45370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w.a f45371b;

        public C0544b(List list, w.a aVar) {
            this.f45370a = list;
            this.f45371b = aVar;
        }

        @Override // com.mgs.carparking.widgets.dialog.DetailsetAudioandSubtitleAdapter.c
        public void a(int i10) {
            b.this.f45365d.g(this.f45370a, i10);
            DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) this.f45371b.D().Q();
            defaultTrackSelector.L(defaultTrackSelector.v().g().j(((DetailsetAudioandSubtitleEntry) this.f45370a.get(i10)).getName()));
            c cVar = b.this.f45366e;
            if (cVar != null) {
                cVar.a(((DetailsetAudioandSubtitleEntry) this.f45370a.get(i10)).getName());
            }
        }
    }

    /* JADX INFO: compiled from: DetailSetAudioPop.java */
    public interface c {
        void a(String str);

        void b(String str);
    }

    public b(Context context, w.a aVar, String str, String str2) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_detail_set_audio_subtitles, (ViewGroup) null);
        this.f45362a = (RecyclerView) viewInflate.findViewById(R.id.rv_list_audio);
        this.f45363b = (RecyclerView) viewInflate.findViewById(R.id.rv_list_subtitles);
        this.f45362a.setLayoutManager(new LinearLayoutManager(context));
        this.f45363b.setLayoutManager(new LinearLayoutManager(context));
        DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) aVar.D().Q();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = true;
        int i10 = 0;
        if (str2.equals(context.getString(R.string.str_subtitles_nothing))) {
            arrayList2.add(new DetailsetAudioandSubtitleEntry(1000, context.getString(R.string.str_subtitles_nothing), context.getString(R.string.str_subtitles_nothing), true));
        } else {
            arrayList2.add(new DetailsetAudioandSubtitleEntry(1000, context.getString(R.string.str_subtitles_nothing), context.getString(R.string.str_subtitles_nothing), false));
        }
        b.a aVarG = defaultTrackSelector.g();
        if (aVarG != null) {
            int i11 = 0;
            while (i11 < aVarG.c()) {
                TrackGroupArray trackGroupArrayE = aVarG.e(i11);
                if (z10 == aVarG.d(i11)) {
                    int i12 = i10;
                    while (i12 < trackGroupArrayE.f20392b) {
                        TrackGroup trackGroupB = trackGroupArrayE.b(i12);
                        Log.d("checkAudio", trackGroupB.b(i10).toString());
                        String str3 = trackGroupB.b(i10).B;
                        if (!o.b(str3)) {
                            DetailsetAudioandSubtitleEntry detailsetAudioandSubtitleEntry = str.equals(str3) ? new DetailsetAudioandSubtitleEntry(i12, str3, t.a(str3), z10) : new DetailsetAudioandSubtitleEntry(i12, str3, t.a(str3), false);
                            if (!a(arrayList, detailsetAudioandSubtitleEntry)) {
                                arrayList.add(detailsetAudioandSubtitleEntry);
                            }
                        }
                        i12++;
                        z10 = true;
                        i10 = 0;
                    }
                } else if (3 == aVarG.d(i11)) {
                    for (int i13 = 0; i13 < trackGroupArrayE.f20392b; i13++) {
                        TrackGroup trackGroupB2 = trackGroupArrayE.b(i13);
                        Log.d("checkSubTitle", trackGroupB2.b(0).toString());
                        String str4 = trackGroupB2.b(0).B;
                        if (!o.b(str4)) {
                            DetailsetAudioandSubtitleEntry detailsetAudioandSubtitleEntry2 = str2.equals(str4) ? new DetailsetAudioandSubtitleEntry(i13, str4, t.a(str4), true) : new DetailsetAudioandSubtitleEntry(i13, str4, t.a(str4), false);
                            if (!a(arrayList2, detailsetAudioandSubtitleEntry2)) {
                                arrayList2.add(detailsetAudioandSubtitleEntry2);
                            }
                        }
                    }
                }
                i11++;
                z10 = true;
                i10 = 0;
            }
        }
        DetailsetAudioandSubtitleAdapter detailsetAudioandSubtitleAdapter = new DetailsetAudioandSubtitleAdapter(context, arrayList);
        this.f45364c = detailsetAudioandSubtitleAdapter;
        this.f45362a.setAdapter(detailsetAudioandSubtitleAdapter);
        this.f45364c.f(new a(arrayList, aVar));
        DetailsetAudioandSubtitleAdapter detailsetAudioandSubtitleAdapter2 = new DetailsetAudioandSubtitleAdapter(context, arrayList2);
        this.f45365d = detailsetAudioandSubtitleAdapter2;
        this.f45363b.setAdapter(detailsetAudioandSubtitleAdapter2);
        this.f45365d.f(new C0544b(arrayList2, aVar));
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(false);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.translucent));
        getContentView().setSystemUiVisibility(5894);
        viewInflate.measure(0, 0);
        setSoftInputMode(3);
        update();
    }

    public boolean a(List<DetailsetAudioandSubtitleEntry> list, DetailsetAudioandSubtitleEntry detailsetAudioandSubtitleEntry) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).getName().equals(detailsetAudioandSubtitleEntry.getName())) {
                return true;
            }
        }
        return false;
    }

    public void b(c cVar) {
        this.f45366e = cVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
