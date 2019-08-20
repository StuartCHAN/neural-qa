# -*- coding: utf-8 -*-
"""
Created on Mon Aug  5 20:20:07 2019

@author: Lenovo
"""

from urllib import request
#导入bs4模块
from bs4 import BeautifulSoup as sp
#引用re方法
import re


# 维基百科url
url = "https://zh.wikipedia.org/wiki/Wikipedia:%E9%A6%96%E9%A1%B5"
#在浏览器下获取他们的headers信息
header = {'User-Agent':'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.221 Safari/537.36 SE 2.X MetaSr 1.0'
          ,'Accept':'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8'}

req = request.Request(url, headers=header)
#打开并读取url内信息
html = request.urlopen(req).read()
#利用bs4库解析html
soup = sp(html,"html.parser")
            
            