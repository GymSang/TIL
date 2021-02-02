

# 코드를 협업하는 방식

* 3가지 협업 모델
  * Push & Pull
  * Fork & PR
  * Branch & PR



# 협업의 전제

* > 협업에서 가장 중요한 것은 : **소통**

  당연하다. 둘 이상이 모인 자리에서 소통이 없다면 그건 혼자나 다름없다 . 아니 혼자보다 못하다.

* > 협업은 **독재다**.  민주는 그 다음

  흠.. 중심이 필요하다는 뜻인거 같다. 모두가 같은 방향으로 나아가기 위해선 구심점을 잡아줄 사람이 필요하다.



# (1) Push & Pull

<u>*끝말잇기 놀이*</u> 

``` bash
sangwon@DESKTOP-UK6G7RT MINGW64 ~/wordchain (master)
$ git pull origin master
remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (1/1), done.
remote: Total 3 (delta 1), reused 3 (delta 1), pack-reused 0
Unpacking objects: 100% (3/3), 268 bytes | 26.00 KiB/s, done.
From https://github.com/dygks4983/wordchain
 * branch            master     -> FETCH_HEAD
   7584828..146596b  master     -> origin/master
Updating 7584828..146596b
Fast-forward
 README.md | 4 ++--
 1 file changed, 2 insertions(+), 2 deletions(-)

sangwon@DESKTOP-UK6G7RT MINGW64 ~/wordchain (master)
$ git add README.md

sangwon@DESKTOP-UK6G7RT MINGW64 ~/wordchain (master)
$ git commit -m "Add 약수역"
[master 829e4e7] Add 약수역
 1 file changed, 3 insertions(+)

sangwon@DESKTOP-UK6G7RT MINGW64 ~/wordchain (master)
$ git push origin master
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 6 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 300 bytes | 300.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/dygks4983/wordchain
   146596b..829e4e7  master -> master
```

[끝말잇기 Github](https://github.com/dygks4983/wordchain.git)

* $ git clone [주소]
  * 해당 주소의 폴더를 복사해서 가져온다. clone을 하기위해선 해당 github reposite의 권한이 있어야한다.
* $ git push [주소]
  * 수정 완료한 문서를 업로드한다.
    * 업로드 하기전 **~/wordchain (master)** 이부분의 뒤 () 프롬포터가 맞는지 확인
* $ git pull [주소]
  * 해당 주소의 폴더를 복사해온다. 이미 clone으로 복사한 폴더에서 사용 가능



## 장점

* 단순함, 기본적인 git 활용만으로 협업 가능



## 단점

* 꼭 공유를 해야만 협업이 가능
  * Fork & PR 협업 모델(오픈소스 협업)
* 한사람의 일이 끝나야 다른사람이 시작 할 수 있다.
  * Asyncronized비동기적 협업이 가능함
* 2인 이상일때 코드가 꼬일 가능성이 있다.





## (2) Fork & PR

[전공입력하기](https://github.com/edu-john/fork-pr)

1. Fork

2. clone

3. add, commit, push

4. pull-request

   

   1. ![포크1](C:\Users\sangwon\Desktop\직업교육\멀티캠퍼스-A.I\정리\210202\포크1.JPG)원하는 `GIT` 페이지에 접속하여 오른쪽에 `Fork`를 클릭한다.

      

      

   2. ![포크2](C:\Users\sangwon\Desktop\직업교육\멀티캠퍼스-A.I\정리\210202\포크2.JPG)왼쪽에 나의 `git`에 `fork` 되어있는지 확인한다. 확인후 URL을 `clone` 기능을 통해 가져온다.

      

      

   3. ```bash
      sangwon@DESKTOP-UK6G7RT MINGW64 ~/fork
      $ git clone https://github.com/GymSang/fork-pr.git
      Cloning into 'fork-pr'...
      remote: Enumerating objects: 9, done.
      remote: Counting objects: 100% (9/9), done.
      remote: Compressing objects: 100% (4/4), done.
      remote: Total 9 (delta 1), reused 4 (delta 1), pack-reused 0
      Receiving objects: 100% (9/9), done.
      Resolving deltas: 100% (1/1), done.
      
      sangwon@DESKTOP-UK6G7RT MINGW64 ~/fork
      $ ls
      fork-pr/
      
      sangwon@DESKTOP-UK6G7RT MINGW64 ~/fork
      $ cd fork-pr
      
      sangwon@DESKTOP-UK6G7RT MINGW64 ~/fork/fork-pr (main)
      $ git add README.md
      
      sangwon@DESKTOP-UK6G7RT MINGW64 ~/fork/fork-pr (main)
      $ git commit -m "Add test"
      [main 5b1394b] Add test
       1 file changed, 1 insertion(+), 1 deletion(-)
      
      sangwon@DESKTOP-UK6G7RT MINGW64 ~/fork/fork-pr (main)
      $ git push origin main
      
      #clone 후 add, commit, push를 진행한다.
      ```

   4. ![포크3_풀리퀘](C:\Users\sangwon\Desktop\직업교육\멀티캠퍼스-A.I\정리\210202\포크3_풀리퀘.JPG) 다시 `git` 페이지로 돌아와 `Pull request`를 클릭한후 `New pull-request`  버튼을 눌러 요청을 작성한다.

      

      

   5. ![포크4-보내기](C:\Users\sangwon\Desktop\직업교육\멀티캠퍼스-A.I\정리\210202\포크4-보내기.JPG) 제목, 내용을 작성하여 요청을 보낸다. 관리자가 승인하면 그 즉시 반영이 완료된다.

      

      

   

   

## (3) Branch & PR

- 자신의 로컬 컴퓨터에서 코드를 추가하는 작업은 branch를 만들어서 진행한다.

> 개발을 하다 보면 코드를 여러 개로 복사해야 하는 일이 자주 생긴다. 코드를 통째로 복사하고 나서 원래 코드와는 상관없이 독립적으로 개발을 진행할 수 있는데, 이렇게 독립적으로 개발하는 것이 브랜치다. 
>
> - pro git book

