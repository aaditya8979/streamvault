package com.mgs.carparking.ui.mine.languageswitching;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.SetLanguageEntry;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SetLanguageAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f44889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f44890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f44891k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<SetLanguageEntry> f44892l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f44893b;

        public a(int i10) {
            this.f44893b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SetLanguageAdapter.this.f44890j != null) {
                SetLanguageAdapter.this.f44890j.a(this.f44893b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f44895l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f44896m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f44897n;

        public b(@NonNull View view) {
            super(view);
            this.f44895l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f44896m = (TextView) view.findViewById(R.id.tv_name);
            this.f44897n = (ImageView) view.findViewById(R.id.iv_select);
        }
    }

    public interface c {
        void a(int i10);
    }

    public SetLanguageAdapter(Context context, List<SetLanguageEntry> list) {
        this.f44889i = context;
        this.f44892l = list;
        this.f44891k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        bVar.f44896m.setText(this.f44892l.get(i10).getDetailname());
        if (this.f44892l.get(i10).isSelector()) {
            bVar.f44896m.setTextColor(this.f44889i.getResources().getColor(R.color.color_42BD56));
            bVar.f44897n.setImageResource(R.drawable.ic_set_language_selected);
        } else {
            bVar.f44896m.setTextColor(this.f44889i.getResources().getColor(R.color.color_item_text_mormal));
            bVar.f44897n.setImageResource(R.drawable.ic_set_language_selected_normal);
        }
        bVar.f44895l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f44891k.inflate(R.layout.item_dialog_set_language, viewGroup, false));
    }

    public void f(c cVar) {
        this.f44890j = cVar;
    }

    public void g(List<SetLanguageEntry> list, int i10) {
        this.f44892l = list;
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
        return this.f44892l.size();
    }
}
