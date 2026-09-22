# LeetCode Hot 100 · Java

使用 Java 持续练习 LeetCode Hot 100。每道题保留独立的 `Solution160<题号>.java` 文件，便于复习、调试与逐题补充。

## 当前进度

已完成 **19 / 100**：

| 题号 | 题目 | 代码 |
| ---: | --- | --- |
| 17 | 电话号码的字母组合 | [`Solution17.java`](Solution17.java) |
| 22 | 括号生成 | [`Solution22.java`](Solution22.java) |
| 39 | 组合总和 | [`Solution39.java`](Solution39.java) |
| 46 | 全排列 | [`Solution46.java`](Solution46.java) |
| 78 | 子集 | [`Solution78.java`](Solution78.java) |
| 79 | 单词搜索 | [`Solution79.java`](Solution79.java) |
| 98 | 验证二叉搜索树 | [`Solution98.java`](Solution98.java) |
| 102 | 二叉树的层序遍历 | [`Solution102.java`](Solution102.java) |
| 105 | 从前序与中序遍历序列构造二叉树 | [`Solution105.java`](Solution105.java) |
| 114 | 二叉树展开为链表 | [`Solution114.java`](Solution114.java) |
| 146 | LRU 缓存 | [`Solution146.java`](Solution146.java) |
| 148 | 排序链表 | [`Solution148.java`](Solution148.java) |
| 199 | 二叉树的右视图 | [`Solution199.java`](Solution199.java) |
| 200 | 岛屿数量 | [`Solution200.java`](Solution200.java) |
| 207 | 课程表 | [`Solution207.java`](Solution207.java) |
| 208 | 实现 Trie（前缀树） | [`Solution208.java`](Solution208.java) |
| 236 | 二叉树的最近公共祖先 | [`Solution236.java`](Solution236.java) |
| 437 | 路径总和 III | [`Solution437.java`](Solution437.java) |
| 994 | 腐烂的橘子 | [`Solution994.java`](Solution994.java) |

公共链表节点定义位于 [`ListNode.java`](ListNode.java)。部分二叉树题目共用 `Solution102.java` 中的 `TreeNode`。

## 本地编译

```bash
mkdir -p out
javac -encoding UTF-8 -d out *.java
```

`out/`、IDE 配置和编译产物均已加入 `.gitignore`，不会上传到仓库。

## 更新方式

本地目录配置了自动同步：后台任务每 12 小时检查一次，发现 Java 文件新增或修改后会自动创建提交并推送到 GitHub；网络异常时会在下一次检查时重试。
