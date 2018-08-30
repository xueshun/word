<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title></title>
    <style>

        /* common css */
        * {
            margin: 0;
            padding:0;
        }
        .text-center {
            text-align: center;
        }
        .text-right {
            text-align: right;
        }

        .margin-vertical--50 {
            margin: 50px 0;
        }

        .margin-vertical--80 {
            margin: 80px 0;
        }
        .margin-bottom--10 {
            margin-bottom:10px;
        }
        .margin-bottom--30 {
            margin-bottom: 30px;
        }

        .margin-bottom--15 {
            margin-bottom: 15px;
        }

        .margin-bottom--10 {
            margin-bottom: 10px;
        }

        .margin-bottom--5 {
            margin-bottom: 5px;
        }

        .padding-left--50 {
            margin-left: 50px;
        }

        .padding-left--80 {
            margin-left: 80px;
        }

        .padding-left--68 {
            margin-left: 68px;
        }
        .padding-left--30 {
            padding-left: 30px;
        }

        .padding-left--35 {
            padding-left: 35px;
        }

        .padding-left--25 {
            padding-left: 25px;
        }

        .border-bottom {
            border-bottom: 1px solid black;
        }

        .float-left {
            float: left
        }
        .float-right {
            float: right;
        }

        .flex {
            display: flex;

        }
        .full {
            flex: 1;
        }
        .width--150 {
            width: 150px;
        }

        /*  */
        .container {
            width: 890px;
            margin: 0 auto;

        }
        .list {
            line-height: 35px;
            text-indent: 40px;
        }
        /* table */
        .table {
            width:100%;
            border-collapse: collapse;
        }
        tr,td {
            border: 1px solid black;
        }
        .col-1 {
            width: 10px;
            padding: 50px 20px;
        }
        .col-2 {
            padding: 10px 20px;
        }
        .col-2-border {
            width: 80%;
            border: 1px solid black;
            padding: 10px;
        }
        /* footer */
        .width-harf {
            width: 50%;
        }
        .footer-img {
            position: absolute;
            right: 0;
            bottom: 100%;
        }
    </style>
</head>
<body>
    <div class='container'>
        <header class="margin-vertical--50">
                <h3 class="text-center">
                    <p>上海市税库银横向联网系统</p>
                    <p>纳税人委托银行划缴税（费）款三方协议书</p>
                </h3>
            </header>
            <section>
                <div class="flex margin-bottom--10">
                    <div>甲方（税务机关）:</div>
                    <div class='border-bottom full'></div>
                </div>
                <div class="flex margin-bottom--10">
                    <div>乙方（纳税人）:</div>
                    <div class='border-bottom full'></div>
                </div>
                <div class="flex margin-bottom--10" style="margin-left:11px">
                    <div >
                        （乙方为个体工商户或自然人的，实际缴税人姓名:
                    </div>
                    <div class='border-bottom full'></div>
                </div>
                <div class="flex margin-bottom--10"style="margin-left:28px">
                    <div  >
                        有效证件类型：</div>
                    <div class='border-bottom full'></div>
                    <div>证件号码：</div>
                    <div class='border-bottom full'> 
                        <div class=' text-right'>)</div>
                    </div>
                </div>
                <div class="flex margin-bottom--10">
                    <div>丙方（纳税人开户银行）:</div>
                    <div class='border-bottom full'></div>
                </div>

                <div>
                    <p class="list">
                         一、甲、乙、丙三方承诺遵守《中华人民共和国税收征收管理法》、《中华人民共和国合同法》等相关法律法规。
                    </p>
                    <p class="list">
                        二、乙方委托丙方根据甲方提供的乙方申报缴款信息，从乙方指定的税库银横向联网系统缴税账户中扣缴税款。
                        缴税账户为乙方通过税库银横向联网系统扣缴税款的唯一指定账户。扣款日期以丙方收到甲方提供的电子扣缴信息日期为准。
                    </p>
                    <p class="list">
                        三、甲方应保证电子缴税信息安全和有效；乙方应保证缴税账户真实和有效；
                        丙方应依法保证乙方账户资金安全；甲、丙方应依法为乙方缴税账户保密。
                    </p>
                    <p class="list">
                        四、乙方应保证在办理每一项缴税的涉税事项时，缴税账户内有足够存款余额。
                        因乙方原因造成丙方无法及时划缴税款而致逾期缴纳的，产生的相关责任由乙方承担。
                    </p>
                    <p class="list">
                        五、乙方通过上海市税务网站办理网上申报缴纳税款的，由甲方在实际确认扣款的三个
                        工作日后，将《电子缴款凭证》信息上传至上海市税务网站，供乙方下载打印，
                        乙方将该凭证与银行对账单电子划缴记录核对一致作为记账凭证。
                    </p>
                    <p class="list">
                        乙方采取定期定额申报方式申报，划缴税款成功的，
                        由丙方在当期申报结束后提供《电子缴税付款凭证》，并加盖银行业务章，乙方以此作为记账凭证。
                    </p>
                    <p class="list">
                        乙方需要开具完税证明的，可凭税务登记证和有效身份证明到甲方，由甲方按照有关规定开具《税收完税证明》。
                    </p>
                    <p class="list">
                        六、本协议书项下发生纠纷，各方应协商解决。经协商后仍不能解决的，相关当事人可根据有关法律、法规提起诉讼。
                    </p>
                    <p class="list">
                        七、下列情况应由甲方通过税库银横向联网系统通知丙方终止协议：
                        一是乙方向甲方申请变更签约缴税账户户名或账号；二是乙方撤销签约缴税账户；三是乙方注销税务登记。
                    </p>
                    <p class="list">
                        八、本协议书一式三份，甲、乙、丙三方各持一份，三方共同签章并经甲、丙方系统验证通过后生效。
                    </p>
                    <p class="list margin-bottom--30">
                        九、本协议书签约、变更、终止流程按照税务机关和人民银行有关文件规定执行。
                    </p>
                </div>
                <table class="table">
                    <tr>
                        <td class="col-1">税务机关填写</td>
                        <td class="col-2">
                            <div class="margin-bottom--10">三方协议书编号：13101102013042635204</div>
                            <div class="margin-bottom--10">纳税人名称：上海瑞晋医疗器械有限公司</div>
                            <div class="margin-bottom--10">纳税人识别号：310110744232832</div>
                            <div class="flex margin-bottom--10">
                                <div> 税务机关名称：</div>
                                <div>
                                    <div class="margin-bottom--10">上海市杨浦区国家税务局 </div>
                                    <div>上海市杨浦区国家税务局 </div>
                                </div>
                            </div>
                            <div class="margin-bottom--10">税务机关代码：13101100000</div>
                        </td>
                    </tr>
                    <tr>
                        <td class="col-1">纳税人开户银行填写</td>
                        <td class="col-2">
                                <div style="color: #8b8b8b " class="margin-bottom--10">（银行套打或粘贴）</div>
                                <div class='col-2-border'>
                                    <div class="margin-bottom--10">开户银行名称：北京银行股份有限公司上海宝山支行 </div>
                                    <div class="margin-bottom--10">开户银行行号：313290020018 </div>
                                    <div class="margin-bottom--10">缴税（费）账户户名：上海瑞晋医疗器械有限公司 </div>
                                    <div class="margin-bottom--10">缴税（费）账户账号：00130630500120109192770</div>
                                    <div class="margin-bottom--10">清算行行号：313290020018</div>
                                    <div class="margin-bottom--10">开户行营业网点代码：313290020034 </div>
                                </div>
                        </td>
                    </tr>
                </table>
            </section>
            <footer class="margin-vertical--50">
                <div class="margin-bottom--5">甲方（税务机关盖章）:</div>
                <div class="margin-bottom--30">
                    <span class="padding-left--68">年</span>
                    <span class="padding-left--30">月</span>
                    <span class="padding-left--30">日</span>
                </div>
                <!-- <div class="margin-bottom--30 flex">
                    <div class='width-harf'>乙方（纳税人盖章）: </div>
                    <div class='width-harf'> 乙方法定代表人：（签章）</div>
                </div> -->
                <div class="margin-bottom--5 flex" style='position:relative'>
                    <div class="width-harf">乙方（纳税人）</div>
                </div>
                <div class="padding-left--35 margin-bottom--5">自然人（签字）：</div>
                <div class="margin-bottom--30">
                    <span class="padding-left--68">年</span>
                    <span class="padding-left--30">月</span>
                    <span class="padding-left--30">日</span>
                </div>

                <div class="margin-bottom--5 flex" style='position:relative'> 
                   <div class="width-harf padding-left--35">单位（盖章）：</div>
                   <div class='width-harf flex'>
                       <div>法定代表人（签章）：</div>
                       <div></div>
                   </div>
                </div>

                <div class="margin-bottom--30 flex" style='position:relative'>
                    <div class="width-harf  ">
                            <span class='padding-left--68'>年</span>
                            <span class="padding-left--30">月</span>
                            <span class="padding-left--30">日</span>
                    </div>
                    <div  class='width-harf flex'>
                        <div class="padding-left--25">指定账号：</div>
                        <div class='full border-bottom text-center'>00130630500120109192770 </div>
                    </div>
                </div>
                <div class="margin-bottom--5">丙方（纳税人开户银行盖章）:</div>
                <div class="margin-bottom--30">
                    <span class="padding-left--68">年</span>
                    <span class="padding-left--30">月</span>
                    <span class="padding-left--30">日</span>
                </div>
            </footer>

    </div>
    
</body>
</html>