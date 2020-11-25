# Android-Custom-UI
To Show Toast and SnackBar.

## Import Library to Gradle

1 - Download CustomUI.zip and place inside "projectName/" folder .

https://cdn.xtsmm.com/android/libraries/CustomUI.zip

2 - Import Module

```
File -> New -> Import Module -> select Downloaded "Android JSON" Folder
```

3 - Add Library at App gradle

```
dependencies {
    implementation project(path: ':CustomUI')
}
```
## Available Method

###### 1. XToast

  1. Change font
  2. Change font style
  3. Change icon
  4. Change background color
  5. Change text color, text size
  6. Change cornerRadius
  7. Change stroke width
  8. Change stroke color
  9. Change Padding
  10. You can change toast duration
  11. You can show toast every position
  
###### 2. XSnackbar

  1. Change font
  2. Change font style
  3. Change icon
  4. Change background color
  5. Change text color, text size
  6. Change cornerRadius
  7. Change stroke width
  8. Change stroke color
  9. Change Padding
  10. You can change snackbar duration
  11. Use action button
  12. if change your action button background transparent use text button
  13. change action button text color, text size
  14. change action button font
  15. change action button font style
  16. change action button ripple color
  17. change action button background
  18.change action button cornerRadius
  19. use snackbar dismiss
  
## Usage

###### 1. XToast

Use Icon,no stoke and use custom show sample

```
XToast xToast=new XToast(MainActivity.this);
                xToast.craete();
                xToast.setText("This is xToast");
                xToast.setIconResource(R.drawable.ic_warning);
                xToast.setCornerRadius(20);
                xToast.setStrokeWidth(0);
                xToast.setBackgroundColor("#00ff00");
                /// phone center 
                xToast.show(Gravity.CENTER,0,0,Toast.LENGTH_LONG);
                /// normal position
                xToast.show(Gravity.CENTER_HORIZONTAL,0,phoneHeight/3,Toast.LENGTH_LONG);
               
```


No Icon,use change text (color,size,style),use stoke,use default show and use duration show sample

```
XToast xToast=new XToast(MainActivity.this);
                xToast.craete();
                xToast.setText("This is xToast");
                xToast.setCornerRadius(100);
                xToast.setStrokeColor("#ff0000");
                xToast.setTextColor("#0000ff");
                xToast.setTextSize(20);
                xToast.setTextStyle(Typeface.BOLD);
                //default show
                xToast.show();
                /// input duration show
                xToast.show(Toast.LENGTH_SHORT);
                
```

###### 1. XSnackbar

No Icon,no stoke,use button cornerRadius,use button ripple color and use default show sample

```
XSnackbar xSnackbar=new XSnackbar(MainActivity.this);
                xSnackbar.craete();
                xSnackbar.setStrokeWidth(0);
                xSnackbar.setText("This is SnackBar");
                xSnackbar.setActionButton(new XSnackbar.setOnClickListener() {
                    @Override
                    public void onClick(View view) {
                        xSnackbar.dismiss();
                    }
                });
                xSnackbar.setActionButtonCornerRadius(10);
                xSnackbar.setActionButtonRippleColor("#00ff00");
                xSnackbar.show();
               
```


Use Icon,use action button as text button,use button change text (color,size,style),use stoke and use duration show sample

```
XSnackbar xSnackbar=new XSnackbar(MainActivity.this);
                xSnackbar.craete();
                xSnackbar.setIconResource(R.drawable.ic_warning);
                xSnackbar.setCornerRadius(100);
                xSnackbar.setStrokeColor("#ff0000");
                xSnackbar.setTextColor("#0000ff");
                xSnackbar.setTextSize(20);
                xSnackbar.setStrokeWidth(2);
                xSnackbar.setText("This is SnackBar");
                xSnackbar.setActionButtonBackgroundColor(Color.TRANSPARENT);
                xSnackbar.setActionButtonTextColor("#000000");
                xSnackbar.setActionButtonText("Close");
                xSnackbar.setActionButtonTextSize(20);
                xSnackbar.setActionButtonTextStyle(Typeface.BOLD);
                xSnackbar.setActionButton(new XSnackbar.setOnClickListener() {
                    @Override
                    public void onClick(View view) {
                        xSnackbar.dismiss();
                    }
                });
                //parentlayout between SnackBar
                xSnackbar.setSnackbarPadding(5,5,5,5);
                //SnackBar between Text
                xSnackbar.setPadding(10,10,10,10);
                xSnackbar.show(Snackbar.LENGTH_SHORT);
                
```
