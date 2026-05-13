package hc;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.CommentListVideoEntry;
import com.mgs.carparking.netbean.DiscussListEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: ITEMCOMMENTVIDEOVIEWMODEL.java */
/* JADX INFO: loaded from: classes2.dex */
public class y0 extends np.c<VIDEOPLAYDETAILVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CommentListVideoEntry f63438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<DiscussListEntry> f63440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableList<u0> f63441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public aq.c<u0> f63442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableField<String> f63443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObservableField<String> f63444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObservableField<String> f63445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObservableField<String> f63446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObservableField<String> f63447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ObservableField<String> f63448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableField<Boolean> f63449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObservableField<Boolean> f63450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ObservableField<Boolean> f63451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ObservableField<SpannableStringBuilder> f63452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f63453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f63454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public pp.b f63455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public pp.b f63456u;

    /* JADX INFO: compiled from: ITEMCOMMENTVIDEOVIEWMODEL.java */
    public class a extends ClickableSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VIDEOPLAYDETAILVIEWMODEL f63457b;

        public a(VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
            this.f63457b = videoplaydetailviewmodel;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            this.f63457b.f44205k.setValue(y0.this.f63453r);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#365899"));
            textPaint.setUnderlineText(false);
        }
    }

    public y0(@NonNull VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, CommentListVideoEntry commentListVideoEntry, int i10) {
        super(videoplaydetailviewmodel);
        this.f63439d = 0;
        this.f63440e = new ArrayList();
        this.f63441f = new ObservableArrayList();
        this.f63442g = aq.c.d(new aq.d() { // from class: hc.v0
            @Override // aq.d
            public final void a(aq.c cVar, int i11, Object obj) {
                cVar.f(7, R.layout.item_comment_video_second_item);
            }
        });
        this.f63443h = new ObservableField<>();
        this.f63444i = new ObservableField<>();
        this.f63445j = new ObservableField<>();
        this.f63446k = new ObservableField<>();
        this.f63447l = new ObservableField<>();
        this.f63448m = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.f63449n = new ObservableField<>(bool);
        this.f63450o = new ObservableField<>(bool);
        Boolean bool2 = Boolean.TRUE;
        this.f63451p = new ObservableField<>(bool2);
        this.f63452q = new ObservableField<>();
        this.f63453r = "";
        this.f63455t = new pp.b(new pp.a() { // from class: hc.w0
            @Override // pp.a
            public final void call() {
                this.f63414a.f();
            }
        });
        this.f63456u = new pp.b(new pp.a() { // from class: hc.x0
            @Override // pp.a
            public final void call() {
                y0.g();
            }
        });
        this.f63438c = commentListVideoEntry;
        this.f63437b = i10;
        this.f63443h.set(commentListVideoEntry.getUser_info().getNickname());
        String content = commentListVideoEntry.getContent();
        if (!zp.o.b(content)) {
            Matcher matcher = Pattern.compile("(http://|https://).+./").matcher(content);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(content);
            if (matcher.find()) {
                this.f63453r = matcher.group();
                spannableStringBuilder.setSpan(new a(videoplaydetailviewmodel), content.indexOf("http"), content.lastIndexOf("/") + 1, 33);
                this.f63452q.set(spannableStringBuilder);
            } else {
                this.f63452q.set(spannableStringBuilder);
            }
        }
        if (!zp.o.b(commentListVideoEntry.getUser_info().getHead_img())) {
            this.f63445j.set(commentListVideoEntry.getUser_info().getHead_img());
        }
        if (commentListVideoEntry.getDiscuss_list() == null || commentListVideoEntry.getDiscuss_list().size() <= 0) {
            this.f63451p.set(bool);
            this.f63450o.set(bool);
            return;
        }
        List<DiscussListEntry> discuss_list = commentListVideoEntry.getDiscuss_list();
        this.f63440e = discuss_list;
        this.f63439d = discuss_list.size();
        this.f63451p.set(bool2);
        this.f63450o.set(bool);
        if (commentListVideoEntry.getDiscuss_count() > 3) {
            this.f63449n.set(bool2);
            this.f63448m.set("查看全部" + commentListVideoEntry.getDiscuss_count() + "条评论");
        } else {
            this.f63449n.set(bool);
        }
        this.f63441f.clear();
        for (int i11 = 0; i11 < commentListVideoEntry.getDiscuss_list().size(); i11++) {
            this.f63441f.add(new u0(videoplaydetailviewmodel, commentListVideoEntry.getDiscuss_list().get(i11), i11, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        zp.o.b(this.f63453r);
    }

    public static /* synthetic */ void g() {
    }
}
