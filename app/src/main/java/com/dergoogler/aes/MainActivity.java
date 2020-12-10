package com.dergoogler.aes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ScrollView;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class MainActivity extends  AppCompatActivity  { 
	
	
	private String fontName = "";
	private String typeace = "";
	private double randomNum = 0;
	private String randgetbackstr = "";
	private String doNotUseThisForSth = "";
	
	private ArrayList<String> letters = new ArrayList<>();
	
	private LinearLayout linear4;
	private LinearLayout linear1;
	private ImageView imageview1;
	private LinearLayout linear6;
	private ImageView imageview3;
	private TextView textview17;
	private LinearLayout linear2;
	private EditText edittext1;
	private LinearLayout linear3;
	private ScrollView vscroll1;
	private TextView textview10;
	private EditText edittext2;
	private TextView textview9;
	private TextView textview13;
	private TextView textview14;
	private TextView textview16;
	
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview17 = (TextView) findViewById(R.id.textview17);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview10 = (TextView) findViewById(R.id.textview10);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview16 = (TextView) findViewById(R.id.textview16);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (getApplicationContext().getPackageName().equals("com.".concat("dergoogler.".concat("aes")))) {
					final com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = new com.google.android.material.bottomsheet.BottomSheetDialog(MainActivity.this);
					
					View bottomSheetView; bottomSheetView = getLayoutInflater().inflate(R.layout.bottomsheet_template,null );
					bottomSheetDialog.setContentView(bottomSheetView);
					
					bottomSheetDialog.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
					TextView t1 = (TextView) bottomSheetView.findViewById(R.id.t1);
					
					TextView t2 = (TextView) bottomSheetView.findViewById(R.id.t2);
					
					TextView b1 = (TextView) bottomSheetView.findViewById(R.id.b1);
					
					TextView b2 = (TextView) bottomSheetView.findViewById(R.id.b2);
					
					ImageView i1 = (ImageView) bottomSheetView.findViewById(R.id.i1);
					
					LinearLayout bg = (LinearLayout) bottomSheetView.findViewById(R.id.bg);
					i1.setImageResource(R.drawable.ic_error_black);
					t1.setText("MIT License");
					t2.setText("MIT License\n\nCopyright (c) 2020 Jimmy Böhm (Der_Googler)\n\nPermission is hereby granted, free of charge, to any person obtaining a copy\nof this software and associated documentation files (the \"Software\"), to deal\nin the Software without restriction, including without limitation the rights\nto use, copy, modify, merge, publish, distribute, sublicense, and/or sell\ncopies of the Software, and to permit persons to whom the Software is\nfurnished to do so, subject to the following conditions:\n\nThe above copyright notice and this permission notice shall be included in all\ncopies or substantial portions of the Software.\n\nTHE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\nIMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\nFITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\nAUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\nLIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\nOUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\nSOFTWARE.");
					b1.setText("Close");
					b2.setText("Okay");
					_RoundAndBorder(i1, "#FF016DE7", 0, "#FF016DE7", 100);
					_rippleRoundStroke(bg, "#FFFFFF", "#000000", 15, 0, "#000000");
					_rippleRoundStroke(b1, "#FFFFFF", "#EEEEEE", 15, 3, "#EEEEEE");
					_rippleRoundStroke(b2, "#FF016DE7", "#16FFFFFF", 15, 0, "#FF016DE7");
					i1.setElevation((float)0.1d);
					_ICC(i1, "#FFFFFF", "#FFFFFF");
					b1.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
							bottomSheetDialog.dismiss();
						}
					});
					b2.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
							bottomSheetDialog.dismiss();
						}
					});
					bottomSheetDialog.setCancelable(true);
					bottomSheetDialog.show();
				}
				else {
					
				}
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				i.setClass(getApplicationContext(), TestHelpActivity.class);
				startActivity(i);
			}
		});
		
		textview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_randomLetterGen(10, edittext2);
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "error");
				}
				else {
					if (edittext2.getText().toString().equals("")) {
						com.google.android.material.snackbar.Snackbar.make(edittext2, "You has not seted an key, do you want to generate one?", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("YES", new View.OnClickListener(){
							@Override
										public void onClick(View _view) {
												_randomLetterGen(10, edittext2);
										}
						}).show();
					}
					else {
						try {
							textview16.setText(AESCrypt.encrypt(edittext2.getText().toString(),edittext1.getText().toString()));
						} catch(Exception e) {
							SketchwareUtil.showMessage(getApplicationContext(), "ERROR:\n" + e);
						}
					}
				}
			}
		});
		
		textview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					if (edittext2.getText().toString().equals("")) {
						SketchwareUtil.showMessage(getApplicationContext(), "select an key");
					}
					else {
						try {
							if (edittext1.getText().toString().equals("")) {
								SketchwareUtil.showMessage(getApplicationContext(), "you can't copy an empty text");
							}
							else {
								try {
									if (textview16.getText().toString().equals("TextView")) {
										SketchwareUtil.showMessage(getApplicationContext(), "you can't copy an empty text");
									}
									else {
										((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", textview16.getText().toString()));
										SketchwareUtil.showMessage(getApplicationContext(), "Copyd!");
									}
								} catch(Exception e) {
									SketchwareUtil.showMessage(getApplicationContext(), "ERROR:\n" + e);
								}
							}
						} catch(Exception e) {
							SketchwareUtil.showMessage(getApplicationContext(), "ERROR:\n" + e);
						}
					}
				} catch(Exception e) {
					SketchwareUtil.showMessage(getApplicationContext(), "ERROR:\n" + e);
				}
			}
		});
		
		textview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "error");
				}
				else {
					if (edittext2.getText().toString().equals("")) {
						com.google.android.material.snackbar.Snackbar.make(edittext2, "You has not seted an key, do you want to generate one?", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("YES", new View.OnClickListener(){
							@Override
										public void onClick(View _view) {
												_randomLetterGen(10, edittext2);
										}
						}).show();
					}
					else {
						try {
							textview16.setText(AESCrypt.decrypt(edittext2.getText().toString(),edittext1.getText().toString()));
						} catch(Exception e) {
							SketchwareUtil.showMessage(getApplicationContext(), "ERROR: " + e);
						}
					}
				}
			}
		});
	}
	
	private void initializeLogic() {
		_DARK_ICONS();
		_changeActivityFont("productsans_regular");
		textview17.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/productsans_regular.ttf"), 1);
		_NavStatusBarColor("#FFFFFF", "#FFFFFF");
		_rippleRoundStroke(edittext1, "#00000000", "#000000", 15, 3, "#EEEEEE");
		_rippleRoundStroke(vscroll1, "#00000000", "#000000", 15, 3, "#EEEEEE");
		_rippleRoundStroke(edittext2, "#00000000", "#000000", 15, 3, "#EEEEEE");
		_rippleRoundStroke(textview10, "#FF016DE7", "#16FFFFFF", 15, 0, "#FF016DE7");
		_rippleRoundStroke(textview9, "#FF016DE7", "#16FFFFFF", 15, 0, "#FF016DE7");
		_rippleRoundStroke(textview13, "#FF016DE7", "#16FFFFFF", 15, 0, "#FF016DE7");
		_rippleRoundStroke(textview14, "#FF016DE7", "#16FFFFFF", 15, 0, "#FF016DE7");
		_rippleRoundStroke(imageview3, "#FFFFFFFF", "#16FFFFFF", 15, 0, "#FFFFFFFF");
		_rippleRoundStroke(imageview1, "#FFFFFFFF", "#16FFFFFF", 15, 0, "#FFFFFFFF");
	}public static final class AESCrypt { private static final String TAG = "AESCrypt"; private static final String AES_MODE = "AES/CBC/PKCS7Padding"; private static final String CHARSET = "UTF-8"; private static final String HASH_ALGORITHM = "SHA-256"; private static final byte[] ivBytes = {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00}; public static boolean DEBUG_LOG_ENABLED = false; private static javax.crypto.spec.SecretKeySpec generateKey(final String password) throws java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException { final java.security.MessageDigest digest = java.security.MessageDigest.getInstance(HASH_ALGORITHM); byte[] bytes = password.getBytes("UTF-8"); digest.update(bytes, 0, bytes.length); byte[] key = digest.digest(); log("SHA-256 key ", key); javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(key, "AES"); return secretKeySpec; } public static String encrypt(final String password, String message) throws java.security.GeneralSecurityException { try { final javax.crypto.spec.SecretKeySpec key = generateKey(password); log("message", message); byte[] cipherText = encrypt(key, ivBytes, message.getBytes(CHARSET)); String encoded = android.util.Base64.encodeToString(cipherText, android.util.Base64.NO_WRAP); log("Base64.NO_WRAP", encoded); return encoded; } catch (java.io.UnsupportedEncodingException e) { if (DEBUG_LOG_ENABLED) android.util.Log.e(TAG, "UnsupportedEncodingException ", e); throw new java.security.GeneralSecurityException(e); } } public static byte[] encrypt(final javax.crypto.spec.SecretKeySpec key, final byte[] iv, final byte[] message) throws java.security.GeneralSecurityException { final javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(AES_MODE); javax.crypto.spec.IvParameterSpec ivSpec = new javax.crypto.spec.IvParameterSpec(iv); cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, key, ivSpec); byte[] cipherText = cipher.doFinal(message); log("cipherText", cipherText); return cipherText; } public static String decrypt(final String password, String base64EncodedCipherText) throws java.security.GeneralSecurityException { try { final javax.crypto.spec.SecretKeySpec key = generateKey(password); log("base64EncodedCipherText", base64EncodedCipherText); byte[] decodedCipherText = android.util.Base64.decode(base64EncodedCipherText, android.util.Base64.NO_WRAP); log("decodedCipherText", decodedCipherText); byte[] decryptedBytes = decrypt(key, ivBytes, decodedCipherText); log("decryptedBytes", decryptedBytes); String message = new String(decryptedBytes, CHARSET); log("message", message); return message; } catch (java.io.UnsupportedEncodingException e) { if (DEBUG_LOG_ENABLED) android.util.Log.e(TAG, "UnsupportedEncodingException ", e); throw new java.security.GeneralSecurityException(e); } } public static byte[] decrypt(final javax.crypto.spec.SecretKeySpec key, final byte[] iv, final byte[] decodedCipherText) throws java.security.GeneralSecurityException { final javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(AES_MODE); javax.crypto.spec.IvParameterSpec ivSpec = new javax.crypto.spec.IvParameterSpec(iv); cipher.init(javax.crypto.Cipher.DECRYPT_MODE, key, ivSpec); byte[] decryptedBytes = cipher.doFinal(decodedCipherText); log("decryptedBytes", decryptedBytes); return decryptedBytes; } private static void log(String what, byte[] bytes) { if (DEBUG_LOG_ENABLED) android.util.Log.d(TAG, what + "[" + bytes.length + "] [" + bytesToHex(bytes) + "]"); } private static void log(String what, String value) { if (DEBUG_LOG_ENABLED) android.util.Log.d(TAG, what + "[" + value.length() + "] [" + value + "]"); } private static String bytesToHex(byte[] bytes) { final char[] hexArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}; char[] hexChars = new char[bytes.length * 2]; int v; for (int j = 0; j < bytes.length; j++) { v = bytes[j] & 0xFF; hexChars[j * 2] = hexArray[v >>> 4]; hexChars[j * 2 + 1] = hexArray[v & 0x0F]; } return new String(hexChars); } private AESCrypt() { }}{
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _NavStatusBarColor (final String _color1, final String _color2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			Window w = this.getWindow();	w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);	w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(Color.parseColor("#" + _color1.replace("#", "")));	w.setNavigationBarColor(Color.parseColor("#" + _color2.replace("#", "")));
		}
	}
	
	
	public void _rippleRoundStroke (final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor("#FF757575")}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _changeActivityFont (final String _fontname) {
		fontName = "fonts/".concat(_fontname.concat(".ttf"));
		overrideFonts(this,getWindow().getDecorView()); 
	} 
	private void overrideFonts(final android.content.Context context, final View v) {
		
		try {
			Typeface 
			typeace = Typeface.createFromAsset(getAssets(), fontName);;
			if ((v instanceof ViewGroup)) {
				ViewGroup vg = (ViewGroup) v;
				for (int i = 0;
				i < vg.getChildCount();
				i++) {
					View child = vg.getChildAt(i);
					overrideFonts(context, child);
				}
			}
			else {
				if ((v instanceof TextView)) {
					((TextView) v).setTypeface(typeace);
				}
				else {
					if ((v instanceof EditText )) {
						((EditText) v).setTypeface(typeace);
					}
					else {
						if ((v instanceof Button)) {
							((Button) v).setTypeface(typeace);
						}
					}
				}
			}
		}
		catch(Exception e)
		
		{
			SketchwareUtil.showMessage(getApplicationContext(), "Error Loading Font");
		};
	}
	
	
	public void _SetStatusBarColor (final String _color) {
		Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor(_color));
	}
	
	
	public void _randomLetterGen (final double _lenght, final TextView _textview) {
		letters.add("a");
		letters.add("b");
		letters.add("c");
		letters.add("d");
		letters.add("e");
		letters.add("f");
		letters.add("g");
		letters.add("h");
		letters.add("i");
		letters.add("j");
		letters.add("k");
		letters.add("l");
		letters.add("m");
		letters.add("n");
		letters.add("o");
		letters.add("p");
		letters.add("q");
		letters.add("r");
		letters.add("s");
		letters.add("t");
		letters.add("u");
		letters.add("v");
		letters.add("w");
		letters.add("x");
		letters.add("y");
		letters.add("z");
		letters.add("1");
		letters.add("2");
		letters.add("3");
		letters.add("4");
		letters.add("5");
		letters.add("6");
		letters.add("7");
		letters.add("8");
		letters.add("9");
		letters.add("0");
		randgetbackstr = "";
		for(int _repeat36 = 0; _repeat36 < (int)(_lenght); _repeat36++) {
			if (SketchwareUtil.getRandom((int)(0), (int)(1)) == 0) {
				doNotUseThisForSth = letters.get((int)(SketchwareUtil.getRandom((int)(0), (int)(letters.size() - 1)))).toLowerCase();
			}
			else {
				doNotUseThisForSth = letters.get((int)(SketchwareUtil.getRandom((int)(0), (int)(letters.size() - 1)))).toUpperCase();
			}
			randgetbackstr = randgetbackstr.concat(doNotUseThisForSth);
		}
		_textview.setText(randgetbackstr);
	}
	
	
	public void _DARK_ICONS () {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
	}
	
	
	public void _RoundAndBorder (final View _view, final String _color1, final double _border, final String _color2, final double _round) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color1));
		gd.setCornerRadius((int) _round);
		gd.setStroke((int) _border, Color.parseColor(_color2));
		_view.setBackground(gd);
	}
	
	
	public void _ICC (final ImageView _img, final String _c1, final String _c2) {
		_img.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(_c1), Color.parseColor(_c2)}));
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
