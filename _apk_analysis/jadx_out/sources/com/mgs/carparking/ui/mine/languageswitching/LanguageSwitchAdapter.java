package com.mgs.carparking.ui.mine.languageswitching;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.SetLanguageEntry;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class LanguageSwitchAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f44873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f44874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f44875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<SetLanguageEntry> f44876l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f44877b;

        public a(int i10) {
            this.f44877b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LanguageSwitchAdapter.this.f44874j != null) {
                LanguageSwitchAdapter.this.f44874j.a(this.f44877b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f44879l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f44880m;

        public b(@NonNull View view) {
            super(view);
            this.f44879l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f44880m = (TextView) view.findViewById(R.id.tv_name);
        }
    }

    public interface c {
        void a(int i10);
    }

    public LanguageSwitchAdapter(Context context, List<SetLanguageEntry> list) {
        this.f44873i = context;
        this.f44876l = list;
        this.f44875k = LayoutInflater.from(context);
    }

    public void d(c cVar) {
        this.f44874j = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        bVar.f44880m.setText(this.f44876l.get(i10).getDetailname());
        if (this.f44876l.get(i10).isSelector()) {
            bVar.f44880m.setTextColor(this.f44873i.getResources().getColor(R.color.color_42BD56));
        } else {
            bVar.f44880m.setTextColor(this.f44873i.getResources().getColor(R.color.color_item_text_mormal));
        }
        bVar.f44879l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f44875k.inflate(R.layout.item_dialog_language_switch, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f44876l.size();
    }
}
