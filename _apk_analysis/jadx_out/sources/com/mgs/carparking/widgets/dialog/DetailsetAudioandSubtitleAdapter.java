package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.DetailsetAudioandSubtitleEntry;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class DetailsetAudioandSubtitleAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f45196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f45197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f45198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<DetailsetAudioandSubtitleEntry> f45199l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45200b;

        public a(int i10) {
            this.f45200b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (DetailsetAudioandSubtitleAdapter.this.f45197j != null) {
                DetailsetAudioandSubtitleAdapter.this.f45197j.a(this.f45200b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f45202l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f45203m;

        public b(@NonNull View view) {
            super(view);
            this.f45202l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f45203m = (TextView) view.findViewById(R.id.tv_name);
        }
    }

    public interface c {
        void a(int i10);
    }

    public DetailsetAudioandSubtitleAdapter(Context context, List<DetailsetAudioandSubtitleEntry> list) {
        this.f45196i = context;
        this.f45199l = list;
        this.f45198k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        bVar.f45203m.setText(this.f45199l.get(i10).getDetailname());
        if (this.f45199l.get(i10).isSelector()) {
            bVar.f45203m.setTextColor(this.f45196i.getResources().getColor(R.color.color_42BD56));
        } else {
            bVar.f45203m.setTextColor(this.f45196i.getResources().getColor(R.color.white));
        }
        bVar.f45202l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f45198k.inflate(R.layout.item_pop_set_speed, viewGroup, false));
    }

    public void f(c cVar) {
        this.f45197j = cVar;
    }

    public void g(List<DetailsetAudioandSubtitleEntry> list, int i10) {
        this.f45199l = list;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setSelector(true);
            } else {
                list.get(i11).setSelector(false);
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f45199l.size();
    }
}
