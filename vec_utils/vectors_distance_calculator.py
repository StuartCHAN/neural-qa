# -*- coding: utf-8 -*-
"""
Created on Mon Jul  8 22:47:56 2019
Final Demo
@author: Stuart
"""

import numpy as np



def cosine_distance(v1, v2): # 余弦距离
    if v1.all() and v2.all():
        return np.dot(v1, v2) / (np.linalg.norm(v1) * np.linalg.norm(v2))
    else:
        return 0


def manhattan_distance(v1, v2):  # 曼哈顿距离
    return np.sum(np.abs(v1 - v2))


def euclidean_distance(v1, v2):  # 欧氏距离
    return np.sqrt(np.sum(np.square(v1 - v2)))


def euclidean_standardized_distance(v1, v2):  # 标准化欧氏距离
    v1_v2 = np.vstack([v1, v2])
    sk_v1_v2 = np.var(v1_v2, axis=0, ddof=1)
    zero_bit = 0.000000001
    distance = np.sqrt(((v1 - v2) ** 2 / (sk_v1_v2 + zero_bit * np.ones_like(sk_v1_v2))).sum())
    return distance


def hamming_distance(v1, v2):
    n = int(v1, 2) ^ int(v2, 2)
    return bin(n & 0xffffffff).count('1')


def chebyshev_distance(v1, v2):  # 切比雪夫距离
    return np.max(np.abs(v1 - v2))


def minkowski_distance(v1, v2):  # 闵可夫斯基距离
    return np.sqrt(np.sum(np.square(v1 - v2)))



def mahalanobis_distance(v1, v2):  # 马氏距离
    # 马氏距离要求样本数要大于维数，否则无法求协方差矩阵
    # 此处进行转置，表示10个样本，每个样本2维
    X = np.vstack([v1, v2])
    XT = X.T # numpy.ndarray.T

    # 方法一：根据公式求解
    S = np.cov(X)  # 两个维度之间协方差矩阵
    try:
        SI = np.linalg.inv(S)  # 协方差矩阵的逆矩阵  todo
    except:
        SI = np.zeros_like(S)
    # 马氏距离计算两个样本之间的距离，此处共有10个样本，两两组合，共有45个距离。
    n = XT.shape[0]
    distance_all = []
    for i in range(0, n):
        for j in range(i + 1, n):
            delta = XT[i] - XT[j]
            distance_1 = np.sqrt(np.dot(np.dot(delta, SI), delta.T))
            distance_all.append(distance_1)
    return np.sum(np.abs(distance_all))


def bray_curtis_distance(v1, v2):  # 布雷柯蒂斯距离(Bray Curtis distance), 生物学生态距离
    up_v1_v2 = np.sum(np.abs(v2 - v1))
    down_v1_v2 = np.sum(v1) + np.sum(v2)
    zero_bit = 0.000000001
    return up_v1_v2 / (down_v1_v2 + zero_bit)


def pearson_correlation_distance(v1, v2):  # 皮尔逊相关系数（Pearson correlation）
    v1_v2 = np.vstack([v1, v2])
    return np.corrcoef(v1_v2)[0][1]


def jaccard_similarity_coefficient_distance(v1, v2):  # 杰卡德相似系数(Jaccard similarity coefficient)
    v1 = np.asarray(v1)
    v2 = np.asarray(v2)
    up = np.double(np.bitwise_and((v1 != v2), np.bitwise_or(v1 != 0, v2 != 0)).sum())
    zero_bit = 0.000000001
    down = np.double(np.bitwise_or(v1 != 0, v2 != 0).sum() + zero_bit)
    jaccard = up/down
    return jaccard


def word_move_distance(model, sentence1_split, sentence2_split):  # WMD
    # model = gensim.models.KeyedVectors.load_word2vec_format(word2_vec_path, unicode_errors='ignore', limit=None)  # ,binary=True)
    # model.init_sims(replace=True)
    distance = model.wmdistance(sentence1_split, sentence2_split)
    return distance


