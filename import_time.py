import time
import test_pyautogui

def screenshot(myfile):
    time.sleep(3)
    img=test_pyautogui.screenshot(myfile)
    img.show()
    mouseat=test_pyautogui.position()
    print("image at",mouseat)
screenshot('pictime.png')
