package com.example.lw.appline.vi.linhcoder.mline;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class a
{
  Resources a = null;
  private Line b;
  private Bitmap[] c;
  private short d = 0;
  private short[] e;
  private short[] f;
  private short[] g;
  private short[] h;
  private short[] i;
  private short[] j;
  private short[] k;
  private short l;
  private short m;
  private int n;
  private int o;
  private boolean p;
  private boolean q;
  private ImageView[] r;
  private Bitmap s;
  private TextView t;
  private int u;
  
  public a(Line paramLine, Resources paramResources)
  {
    this.b = paramLine;
    this.a = paramResources;
  }
  
  private short a(short paramShort1, short paramShort2)
  {
    Object localObject = new boolean['©'];
    short[] arrayOfShort2 = new short['©'];
    short[] arrayOfShort1 = new short['©'];
    short[] arrayOfShort3 = new short[100];
    arrayOfShort2[0] = paramShort1;
    localObject[paramShort1] = 1;
    int i3 = 1;
    if (i3 <= 0) {
      return 0;
    }
    int i4 = 0;
    int i2 = 0;
    short s1;
    int i5;
    for (;;)
    {
      if (i4 >= i3)
      {
        i3 = 0;
        if (i3 < i2) {
          break label247;
        }
        i3 = i2;
        break;
      }
      s1 = arrayOfShort2[i4];
      i5 = 0;
      label86:
      if (i5 < 4) {
        break label102;
      }
      i4 = (short)(i4 + 1);
    }
    label102:
    int i6 = (short)(this.g[arrayOfShort2[i4]] + this.h[i5]);
    int i1 = this.f[i6];
    if ((i1 != -4) && (this.e[i1] <= 0) && (localObject[i1] == 0))
    {
      i6 = (short)(i2 + 1);
      arrayOfShort3[i2] = i1;
      arrayOfShort1[i1] = s1;
      localObject[i1] = 1;
      i2 = i6;
    }
    for (;;)
    {
      if (localObject[paramShort2] != 0) {}
      for (i2 = 0;; i2 = s1)
      {
        localObject = this.j;
        s1 = (short)(i2 + 1);
        localObject[i2] = paramShort2;
        paramShort2 = arrayOfShort1[paramShort2];
        if (paramShort2 == paramShort1)
        {
          this.j[s1] = paramShort1;
          System.gc();
          return s1;
          i5 = (short)(i5 + 1);
          break label86;
          label247:
          arrayOfShort2[i3] = arrayOfShort3[i3];
          i3 = (short)(i3 + 1);
          break;
        }
      }
    }
  }
  
  private void a(final int paramInt)
  {
    final Handler localHandler = new Handler();
    new Timer().schedule(new TimerTask()
    {
      public void run()
      {
        localHandler.post(new Runnable()
        {
          public void run()
          {
            if (this.b >= 0)
            {
              a.a(a.this, a.i(a.this)[(this.b + 1)], null);
              a.a(a.this, a.i(a.this)[this.b], new BitmapDrawable(a.j(a.this)[a.a(a.this)[a.d(a.this)]]));
              a.c(a.this, this.b - 1);
              return;
            }
            a.a(a.this)[a.e(a.this)] = a.a(a.this)[a.d(a.this)];
            a.a(a.this)[a.d(a.this)] = 0;
            a.a(a.this, (short)0);
            a locala = a.this;
            a.b(a.this, 0);
            a.a(locala, 0);
            a.a(a.this, false);
            int i = 0;
            if (i >= 169)
            {
              a.b(a.this, (short)-1);
              i = 0;
              label248:
              if (i < 169) {
                break label459;
              }
              a.b(a.this, a.k(a.this));
              if (a.l(a.this)) {
                i = 0;
              }
            }
            for (;;)
            {
              if (i >= a.m(a.this))
              {
                a.c(a.this, (short)0);
                a.o(a.this).setText(a.this.a.getString(2131034115) + a.p(a.this));
                return;
                if (a.a(a.this)[i] < 0)
                {
                  a.a(a.this)[i] = ((short)-a.a(a.this)[i]);
                  a.a(a.this, i, new BitmapDrawable(a.j(a.this)[a.a(a.this)[i]]));
                }
                i += 1;
                break;
                label459:
                if (a.a(a.this)[i] < 0) {
                  a.a(a.this, i, new BitmapDrawable(a.j(a.this)[(-a.a(a.this)[i] + 7)]));
                }
                i += 1;
                break label248;
              }
              a.a(a.this)[a.n(a.this)[i]] = 0;
              a.a(a.this, a.n(a.this)[i], null);
              i += 1;
            }
          }
        });
      }
    }, 60L);
  }
  
  private void a(int paramInt, Drawable paramDrawable)
  {
    ((ImageView)this.b.findViewById(paramInt)).setImageDrawable(paramDrawable);
  }
  
  private void a(LinearLayout paramLinearLayout)
  {
    this.s = Bitmap.createBitmap(this.u * 30, this.u * 30, Config.ARGB_8888);
    Canvas localCanvas = new Canvas(this.s);
    localCanvas.drawColor(this.b.getResources().getColor(2131165184));
    Paint localPaint = new Paint();
    localPaint.setStrokeWidth(1.0F);
    localPaint.setColor(-7829368);
    localPaint.setStrokeCap(Cap.ROUND);
    localPaint.setStrokeJoin(Join.ROUND);
    localPaint.setAntiAlias(true);
    int i1 = 1;
    for (;;)
    {
      if (i1 >= this.u)
      {
        paramLinearLayout.setBackgroundDrawable(new BitmapDrawable(this.s));
        this.t = ((TextView)this.b.findViewById(2131230731));
        this.t.setText(this.a.getString(2131034115) + this.d);
        return;
      }
      localCanvas.drawLine(0.0F, i1 * 30, 390.0F, i1 * 30, localPaint);
      localCanvas.drawLine(i1 * 30, 0.0F, i1 * 30, 390.0F, localPaint);
      i1 += 1;
    }
  }
  
  private void a(short paramShort)
  {
    Random localRandom = new Random();
    int i1 = 0;
    int i2;
    do
    {
      int i3 = (short)(Math.abs(localRandom.nextInt()) % (this.u * this.u));
      short s1 = (short)(Math.abs(localRandom.nextInt()) % 7 + 1);
      i2 = i1;
      if (this.e[i3] == 0)
      {
        i2 = i1;
        if (i3 != 0)
        {
          i2 = i1;
          if (s1 != 0)
          {
            this.e[i3] = ((short)(s1 * paramShort));
            i2 = (short)(i1 + 1);
          }
        }
      }
      i1 = i2;
    } while (i2 < 3);
  }
  
  private void b()
  {
    this.u = 13;
    this.g = new short[] { 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208 };
    short[] arrayOfShort = new short['á'];
    arrayOfShort[0] = -4;
    arrayOfShort[1] = -4;
    arrayOfShort[2] = -4;
    arrayOfShort[3] = -4;
    arrayOfShort[4] = -4;
    arrayOfShort[5] = -4;
    arrayOfShort[6] = -4;
    arrayOfShort[7] = -4;
    arrayOfShort[8] = -4;
    arrayOfShort[9] = -4;
    arrayOfShort[10] = -4;
    arrayOfShort[11] = -4;
    arrayOfShort[12] = -4;
    arrayOfShort[13] = -4;
    arrayOfShort[14] = -4;
    arrayOfShort[15] = -4;
    arrayOfShort[17] = 1;
    arrayOfShort[18] = 2;
    arrayOfShort[19] = 3;
    arrayOfShort[20] = 4;
    arrayOfShort[21] = 5;
    arrayOfShort[22] = 6;
    arrayOfShort[23] = 7;
    arrayOfShort[24] = 8;
    arrayOfShort[25] = 9;
    arrayOfShort[26] = 10;
    arrayOfShort[27] = 11;
    arrayOfShort[28] = 12;
    arrayOfShort[29] = -4;
    arrayOfShort[30] = -4;
    arrayOfShort[31] = 13;
    arrayOfShort[32] = 14;
    arrayOfShort[33] = 15;
    arrayOfShort[34] = 16;
    arrayOfShort[35] = 17;
    arrayOfShort[36] = 18;
    arrayOfShort[37] = 19;
    arrayOfShort[38] = 20;
    arrayOfShort[39] = 21;
    arrayOfShort[40] = 22;
    arrayOfShort[41] = 23;
    arrayOfShort[42] = 24;
    arrayOfShort[43] = 25;
    arrayOfShort[44] = -4;
    arrayOfShort[45] = -4;
    arrayOfShort[46] = 26;
    arrayOfShort[47] = 27;
    arrayOfShort[48] = 28;
    arrayOfShort[49] = 29;
    arrayOfShort[50] = 30;
    arrayOfShort[51] = 31;
    arrayOfShort[52] = 32;
    arrayOfShort[53] = 33;
    arrayOfShort[54] = 34;
    arrayOfShort[55] = 35;
    arrayOfShort[56] = 36;
    arrayOfShort[57] = 37;
    arrayOfShort[58] = 38;
    arrayOfShort[59] = -4;
    arrayOfShort[60] = -4;
    arrayOfShort[61] = 39;
    arrayOfShort[62] = 40;
    arrayOfShort[63] = 41;
    arrayOfShort[64] = 42;
    arrayOfShort[65] = 43;
    arrayOfShort[66] = 44;
    arrayOfShort[67] = 45;
    arrayOfShort[68] = 46;
    arrayOfShort[69] = 47;
    arrayOfShort[70] = 48;
    arrayOfShort[71] = 49;
    arrayOfShort[72] = 50;
    arrayOfShort[73] = 51;
    arrayOfShort[74] = -4;
    arrayOfShort[75] = -4;
    arrayOfShort[76] = 52;
    arrayOfShort[77] = 53;
    arrayOfShort[78] = 54;
    arrayOfShort[79] = 55;
    arrayOfShort[80] = 56;
    arrayOfShort[81] = 57;
    arrayOfShort[82] = 58;
    arrayOfShort[83] = 59;
    arrayOfShort[84] = 60;
    arrayOfShort[85] = 61;
    arrayOfShort[86] = 62;
    arrayOfShort[87] = 63;
    arrayOfShort[88] = 64;
    arrayOfShort[89] = -4;
    arrayOfShort[90] = -4;
    arrayOfShort[91] = 65;
    arrayOfShort[92] = 66;
    arrayOfShort[93] = 67;
    arrayOfShort[94] = 68;
    arrayOfShort[95] = 69;
    arrayOfShort[96] = 70;
    arrayOfShort[97] = 71;
    arrayOfShort[98] = 72;
    arrayOfShort[99] = 73;
    arrayOfShort[100] = 74;
    arrayOfShort[101] = 75;
    arrayOfShort[102] = 76;
    arrayOfShort[103] = 77;
    arrayOfShort[104] = -4;
    arrayOfShort[105] = -4;
    arrayOfShort[106] = 78;
    arrayOfShort[107] = 79;
    arrayOfShort[108] = 80;
    arrayOfShort[109] = 81;
    arrayOfShort[110] = 82;
    arrayOfShort[111] = 83;
    arrayOfShort[112] = 84;
    arrayOfShort[113] = 85;
    arrayOfShort[114] = 86;
    arrayOfShort[115] = 87;
    arrayOfShort[116] = 88;
    arrayOfShort[117] = 89;
    arrayOfShort[118] = 90;
    arrayOfShort[119] = -4;
    arrayOfShort[120] = -4;
    arrayOfShort[121] = 91;
    arrayOfShort[122] = 92;
    arrayOfShort[123] = 93;
    arrayOfShort[124] = 94;
    arrayOfShort[125] = 95;
    arrayOfShort[126] = 96;
    arrayOfShort[127] = 97;
    arrayOfShort[''] = 98;
    arrayOfShort[''] = 99;
    arrayOfShort[''] = 100;
    arrayOfShort[''] = 101;
    arrayOfShort[''] = 102;
    arrayOfShort[''] = 103;
    arrayOfShort[''] = -4;
    arrayOfShort[''] = -4;
    arrayOfShort[''] = 104;
    arrayOfShort[''] = 105;
    arrayOfShort[''] = 106;
    arrayOfShort[''] = 107;
    arrayOfShort[''] = 108;
    arrayOfShort[''] = 109;
    arrayOfShort[''] = 110;
    arrayOfShort[''] = 111;
    arrayOfShort[''] = 112;
    arrayOfShort[''] = 113;
    arrayOfShort[''] = 114;
    arrayOfShort[''] = 115;
    arrayOfShort[''] = 116;
    arrayOfShort[''] = -4;
    arrayOfShort[''] = -4;
    arrayOfShort[''] = 117;
    arrayOfShort[''] = 118;
    arrayOfShort[''] = 119;
    arrayOfShort[''] = 120;
    arrayOfShort[''] = 121;
    arrayOfShort[''] = 122;
    arrayOfShort[''] = 123;
    arrayOfShort[''] = 124;
    arrayOfShort[''] = 125;
    arrayOfShort[' '] = 126;
    arrayOfShort['¡'] = 127;
    arrayOfShort['¢'] = 128;
    arrayOfShort['£'] = 129;
    arrayOfShort['¤'] = -4;
    arrayOfShort['¥'] = -4;
    arrayOfShort['¦'] = 130;
    arrayOfShort['§'] = 131;
    arrayOfShort['¨'] = 132;
    arrayOfShort['©'] = 133;
    arrayOfShort['ª'] = 134;
    arrayOfShort['«'] = 135;
    arrayOfShort['¬'] = 136;
    arrayOfShort['­'] = 137;
    arrayOfShort['®'] = 138;
    arrayOfShort['¯'] = 139;
    arrayOfShort['°'] = 140;
    arrayOfShort['±'] = 141;
    arrayOfShort['²'] = 142;
    arrayOfShort['³'] = -4;
    arrayOfShort['´'] = -4;
    arrayOfShort['µ'] = 143;
    arrayOfShort['¶'] = 144;
    arrayOfShort['·'] = 145;
    arrayOfShort['¸'] = 146;
    arrayOfShort['¹'] = 147;
    arrayOfShort['º'] = 148;
    arrayOfShort['»'] = 149;
    arrayOfShort['¼'] = 150;
    arrayOfShort['½'] = 151;
    arrayOfShort['¾'] = 152;
    arrayOfShort['¿'] = 153;
    arrayOfShort['À'] = 154;
    arrayOfShort['Á'] = 155;
    arrayOfShort['Â'] = -4;
    arrayOfShort['Ã'] = -4;
    arrayOfShort['Ä'] = 156;
    arrayOfShort['Å'] = 157;
    arrayOfShort['Æ'] = 158;
    arrayOfShort['Ç'] = 159;
    arrayOfShort['È'] = 160;
    arrayOfShort['É'] = 161;
    arrayOfShort['Ê'] = 162;
    arrayOfShort['Ë'] = 163;
    arrayOfShort['Ì'] = 164;
    arrayOfShort['Í'] = 165;
    arrayOfShort['Î'] = 166;
    arrayOfShort['Ï'] = 167;
    arrayOfShort['Ð'] = 168;
    arrayOfShort['Ñ'] = -4;
    arrayOfShort['Ò'] = -4;
    arrayOfShort['Ó'] = -4;
    arrayOfShort['Ô'] = -4;
    arrayOfShort['Õ'] = -4;
    arrayOfShort['Ö'] = -4;
    arrayOfShort['×'] = -4;
    arrayOfShort['Ø'] = -4;
    arrayOfShort['Ù'] = -4;
    arrayOfShort['Ú'] = -4;
    arrayOfShort['Û'] = -4;
    arrayOfShort['Ü'] = -4;
    arrayOfShort['Ý'] = -4;
    arrayOfShort['Þ'] = -4;
    arrayOfShort['ß'] = -4;
    arrayOfShort['à'] = -4;
    this.f = arrayOfShort;
    this.r = new ImageView[this.u * this.u];
    this.h = new short[] { -1, -15, 1, 15 };
    this.i = new short[] { 1, 16, 15, 14 };
    this.e = new short[this.u * this.u];
    this.j = new short[50];
    this.k = new short[16];
    this.d = 0;
    this.l = 0;
    this.m = -1;
    a((short)1);
    a((short)-1);
  }
  
  private void c()
  {
    int i2 = 0;
    Object localObject = (LinearLayout)this.b.findViewById(2131230730);
    a((LinearLayout)localObject);
    LinearLayout[] arrayOfLinearLayout = new LinearLayout[13];
    LayoutParams localLayoutParams = new LayoutParams(-1, -1, 1.0F);
    int i1 = 0;
    for (;;)
    {
      if (i1 >= this.u)
      {
        localObject = new OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            int i = paramAnonymousView.getId();
            if ((a.a(a.this)[i] > 0) && (!a.b(a.this)))
            {
              a.a(a.this, i);
              a.a(a.this, true);
              a.c(a.this);
            }
            do
            {
              do
              {
                return;
                if ((a.a(a.this)[i] > 0) || (!a.b(a.this)) || (a.d(a.this) == 0)) {
                  break;
                }
                a.b(a.this, i);
                a.a(a.this, a.a(a.this, (short)a.d(a.this), (short)a.e(a.this)));
              } while (a.f(a.this) == 0);
              a.g(a.this);
              a.h(a.this);
              return;
            } while (a.a(a.this)[i] <= 0);
            a.g(a.this);
            a.a(a.this, i);
            a.c(a.this);
          }
        };
        i1 = i2;
        if (i1 < this.u * this.u) {
          break;
        }
        return;
      }
      arrayOfLinearLayout[i1] = new LinearLayout(this.b);
      arrayOfLinearLayout[i1].setGravity(1);
      arrayOfLinearLayout[i1].setOrientation(0);
      arrayOfLinearLayout[i1].setLayoutParams(localLayoutParams);
      ((LinearLayout)localObject).addView(arrayOfLinearLayout[i1]);
      i1 += 1;
    }
    i2 = i1 / this.u;
    this.r[i1] = new ImageView(this.b);
    this.r[i1].setLayoutParams(localLayoutParams);
    this.r[i1].setId(i1);
    this.r[i1].setOnClickListener((OnClickListener)localObject);
    if (this.e[i1] > 0) {
      this.r[i1].setImageDrawable(new BitmapDrawable(this.c[this.e[i1]]));
    }
    for (;;)
    {
      arrayOfLinearLayout[i2].addView(this.r[i1]);
      i1 += 1;
      break;
      if (this.e[i1] < 0) {
        this.r[i1].setImageDrawable(new BitmapDrawable(this.c[(-this.e[i1] + 7)]));
      }
    }
  }
  
  private void d()
  {
    a(this.m - 1);
  }
  
  private void e()
  {
    ((ImageView)this.b.findViewById(this.n)).startAnimation(AnimationUtils.loadAnimation(this.b, 2130968576));
  }
  
  private void f()
  {
    ((ImageView)this.b.findViewById(this.n)).clearAnimation();
  }
  
  private boolean g()
  {
    int i4 = -1;
    short[] arrayOfShort = new short[20];
    int i3;
    for (int i2 = 0;; i2 = (short)(i2 + 1))
    {
      if (i2 >= 20)
      {
        i3 = 0;
        i2 = i4;
        if (i3 < 165) {
          break;
        }
        if (i2 < 4) {
          break label414;
        }
        i3 = 0;
        if (i3 < i2 + 1) {
          break label380;
        }
        this.l = ((short)(i2 + 1));
        if (i2 <= 4) {
          break label398;
        }
        this.d = ((short)(this.d + (i2 + 1 + (i2 + 1) / 2 * i2)));
        label77:
        return true;
      }
      arrayOfShort[i2] = -1;
    }
    i4 = i2;
    if (this.e[i3] > 0) {
      if (i3 <= 116) {
        break label137;
      }
    }
    int i5;
    label137:
    for (i4 = 1;; i4 = 4)
    {
      i5 = 0;
      label116:
      if (i5 < i4) {
        break label143;
      }
      i4 = i2;
      i3 = (short)(i3 + 1);
      i2 = i4;
      break;
    }
    label143:
    int i8 = this.g[i3];
    int i6 = 0;
    int i7 = 0;
    label157:
    label164:
    label181:
    int i1;
    int i10;
    int i9;
    if (i7 >= 10)
    {
      if (i6 < 4) {
        break label426;
      }
      i7 = 0;
      i8 = this.g[i3];
      i1 = this.f[i8];
      i10 = 0;
      i9 = 0;
      label195:
      if (i9 < 20) {
        break label344;
      }
      label202:
      if (i10 != 0) {
        break label423;
      }
      i2 = (short)(i2 + 1);
      arrayOfShort[i2] = i1;
      label217:
      i8 = (short)(i8 + this.i[i5]);
      i9 = (short)(i7 + 1);
      if (i7 != i6) {
        break label416;
      }
    }
    label398:
    label414:
    label416:
    label423:
    label426:
    for (;;)
    {
      i5 = (short)(i5 + 1);
      break label116;
      i9 = (short)(i8 + this.i[i5]);
      i10 = this.f[i9];
      if ((i10 == -4) || (this.e[i10] != this.e[i3])) {
        break label164;
      }
      i8 = i6;
      if (this.e[i10] == this.e[i3]) {
        i8 = (short)(i6 + 1);
      }
      i7 = (short)(i7 + 1);
      i6 = i8;
      i8 = i9;
      break label157;
      label344:
      if ((arrayOfShort[i9] == -1) || (i10 != 0)) {
        break label202;
      }
      if (arrayOfShort[i9] == i1) {
        i10 = 1;
      }
      i9 = (short)(i9 + 1);
      break label195;
      label380:
      this.k[i3] = arrayOfShort[i3];
      i3 = (short)(i3 + 1);
      break;
      this.d = ((short)(this.d + (i2 + 1)));
      break label77;
      return false;
      i7 = i9;
      break label181;
      break label217;
    }
  }
  
  public void a()
  {
    this.b.setContentView(2130903042);
    b();
    this.c = b.a(this.b);
    c();
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     vi.linhcoder.mline.a
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */