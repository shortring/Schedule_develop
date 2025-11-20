API명세서
[API 명세서 9ecbf85eb9dd4b619274cf735d5a84e0.html](https://github.com/user-attachments/files/23641646/API.9ecbf85eb9dd4b619274cf735d5a84e0.html)
<html><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8"/><title>API 명세서</title><style>
/* cspell:disable-file */
/* webkit printing magic: print all background colors */
html {
	-webkit-print-color-adjust: exact;
}
* {
	box-sizing: border-box;
	-webkit-print-color-adjust: exact;
}

html,
body {
	margin: 0;
	padding: 0;
}
@media only screen {
	body {
		margin: 2em auto;
		max-width: 900px;
		color: rgb(55, 53, 47);
	}
}

body {
	line-height: 1.5;
	white-space: pre-wrap;
}

a,
a.visited {
	color: inherit;
	text-decoration: underline;
}

.pdf-relative-link-path {
	font-size: 80%;
	color: #444;
}

h1,
h2,
h3 {
	letter-spacing: -0.01em;
	line-height: 1.2;
	font-weight: 600;
	margin-bottom: 0;
}

.page-title {
	font-size: 2.5rem;
	font-weight: 700;
	margin-top: 0;
	margin-bottom: 0.75em;
}

h1 {
	font-size: 1.875rem;
	margin-top: 1.875rem;
}

h2 {
	font-size: 1.5rem;
	margin-top: 1.5rem;
}

h3 {
	font-size: 1.25rem;
	margin-top: 1.25rem;
}

.source {
	border: 1px solid #ddd;
	border-radius: 3px;
	padding: 1.5em;
	word-break: break-all;
}

.callout {
	border-radius: 10px;
	padding: 1rem;
}

figure {
	margin: 1.25em 0;
	page-break-inside: avoid;
}

figcaption {
	opacity: 0.5;
	font-size: 85%;
	margin-top: 0.5em;
}

mark {
	background-color: transparent;
}

.indented {
	padding-left: 1.5em;
}

hr {
	background: transparent;
	display: block;
	width: 100%;
	height: 1px;
	visibility: visible;
	border: none;
	border-bottom: 1px solid rgba(55, 53, 47, 0.09);
}

img {
	max-width: 100%;
}

@media only print {
	img {
		max-height: 100vh;
		object-fit: contain;
	}
}

@page {
	margin: 1in;
}

.collection-content {
	font-size: 0.875rem;
}

.collection-content td {
	white-space: pre-wrap;
	word-break: break-word;
}

.column-list {
	display: flex;
	justify-content: space-between;
}

.column {
	padding: 0 1em;
}

.column:first-child {
	padding-left: 0;
}

.column:last-child {
	padding-right: 0;
}

.table_of_contents-item {
	display: block;
	font-size: 0.875rem;
	line-height: 1.3;
	padding: 0.125rem;
}

.table_of_contents-indent-1 {
	margin-left: 1.5rem;
}

.table_of_contents-indent-2 {
	margin-left: 3rem;
}

.table_of_contents-indent-3 {
	margin-left: 4.5rem;
}

.table_of_contents-link {
	text-decoration: none;
	opacity: 0.7;
	border-bottom: 1px solid rgba(55, 53, 47, 0.18);
}

table,
th,
td {
	border: 1px solid rgba(55, 53, 47, 0.09);
	border-collapse: collapse;
}

table {
	border-left: none;
	border-right: none;
}

th,
td {
	font-weight: normal;
	padding: 0.25em 0.5em;
	line-height: 1.5;
	min-height: 1.5em;
	text-align: left;
}

th {
	color: rgba(55, 53, 47, 0.6);
}

ol,
ul {
	margin: 0;
	margin-block-start: 0.6em;
	margin-block-end: 0.6em;
}

li > ol:first-child,
li > ul:first-child {
	margin-block-start: 0.6em;
}

ul > li {
	list-style: disc;
}

ul.to-do-list {
	padding-inline-start: 0;
}

ul.to-do-list > li {
	list-style: none;
}

.to-do-children-checked {
	text-decoration: line-through;
	opacity: 0.375;
}

ul.toggle > li {
	list-style: none;
}

ul {
	padding-inline-start: 1.7em;
}

ul > li {
	padding-left: 0.1em;
}

ol {
	padding-inline-start: 1.6em;
}

ol > li {
	padding-left: 0.2em;
}

.mono ol {
	padding-inline-start: 2em;
}

.mono ol > li {
	text-indent: -0.4em;
}

.toggle {
	padding-inline-start: 0em;
	list-style-type: none;
}

/* Indent toggle children */
.toggle > li > details {
	padding-left: 1.7em;
}

.toggle > li > details > summary {
	margin-left: -1.1em;
}

.selected-value {
	display: inline-block;
	padding: 0 0.5em;
	background: rgba(206, 205, 202, 0.5);
	border-radius: 3px;
	margin-right: 0.5em;
	margin-top: 0.3em;
	margin-bottom: 0.3em;
	white-space: nowrap;
}

.collection-title {
	display: inline-block;
	margin-right: 1em;
}

.page-description {
	margin-bottom: 2em;
}

.simple-table {
	margin-top: 1em;
	font-size: 0.875rem;
	empty-cells: show;
}
.simple-table td {
	height: 29px;
	min-width: 120px;
}

.simple-table th {
	height: 29px;
	min-width: 120px;
}

.simple-table-header-color {
	background: rgb(247, 246, 243);
	color: black;
}
.simple-table-header {
	font-weight: 500;
}

time {
	opacity: 0.5;
}

.icon {
	display: inline-flex;
	align-items: center;
	justify-content: center;
	max-width: 1.2em;
	max-height: 1.2em;
	text-decoration: none;
	vertical-align: text-bottom;
	margin-right: 0.5em;
}

img.icon {
	border-radius: 3px;
}

.callout img.notion-static-icon {
	width: 1em;
	height: 1em;
}

.callout p {
	margin: 0;
}

.callout h1,
.callout h2,
.callout h3 {
	margin: 0 0 0.6rem;
}

.user-icon {
	width: 1.5em;
	height: 1.5em;
	border-radius: 100%;
	margin-right: 0.5rem;
}

.user-icon-inner {
	font-size: 0.8em;
}

.text-icon {
	border: 1px solid #000;
	text-align: center;
}

.page-cover-image {
	display: block;
	object-fit: cover;
	width: 100%;
	max-height: 30vh;
}

.page-header-icon {
	font-size: 3rem;
	margin-bottom: 1rem;
}

.page-header-icon-with-cover {
	margin-top: -0.72em;
	margin-left: 0.07em;
}

.page-header-icon img {
	border-radius: 3px;
}

.link-to-page {
	margin: 1em 0;
	padding: 0;
	border: none;
	font-weight: 500;
}

p > .user {
	opacity: 0.5;
}

td > .user,
td > time {
	white-space: nowrap;
}

input[type="checkbox"] {
	transform: scale(1.5);
	margin-right: 0.6em;
	vertical-align: middle;
}

p {
	margin-top: 0.5em;
	margin-bottom: 0.5em;
}

.image {
	border: none;
	margin: 1.5em 0;
	padding: 0;
	border-radius: 0;
	text-align: center;
}

.code,
code {
	background: rgba(135, 131, 120, 0.15);
	border-radius: 3px;
	padding: 0.2em 0.4em;
	border-radius: 3px;
	font-size: 85%;
	tab-size: 2;
}

code {
	color: #eb5757;
}

.code {
	padding: 1.5em 1em;
}

.code-wrap {
	white-space: pre-wrap;
	word-break: break-all;
}

.code > code {
	background: none;
	padding: 0;
	font-size: 100%;
	color: inherit;
}

blockquote {
	font-size: 1em;
	margin: 1em 0;
	padding-left: 1em;
	border-left: 3px solid rgb(55, 53, 47);
}

blockquote.quote-large {
	font-size: 1.25em;
}

.bookmark {
	text-decoration: none;
	max-height: 8em;
	padding: 0;
	display: flex;
	width: 100%;
	align-items: stretch;
}

.bookmark-title {
	font-size: 0.85em;
	overflow: hidden;
	text-overflow: ellipsis;
	height: 1.75em;
	white-space: nowrap;
}

.bookmark-text {
	display: flex;
	flex-direction: column;
}

.bookmark-info {
	flex: 4 1 180px;
	padding: 12px 14px 14px;
	display: flex;
	flex-direction: column;
	justify-content: space-between;
}

.bookmark-image {
	width: 33%;
	flex: 1 1 180px;
	display: block;
	position: relative;
	object-fit: cover;
	border-radius: 1px;
}

.bookmark-description {
	color: rgba(55, 53, 47, 0.6);
	font-size: 0.75em;
	overflow: hidden;
	max-height: 4.5em;
	word-break: break-word;
}

.bookmark-href {
	font-size: 0.75em;
	margin-top: 0.25em;
}

.sans { font-family: ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI Variable Display", "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol"; }
.code { font-family: "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace; }
.serif { font-family: Lyon-Text, Georgia, ui-serif, serif; }
.mono { font-family: iawriter-mono, Nitti, Menlo, Courier, monospace; }
.pdf .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI Variable Display", "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK JP'; }
.pdf:lang(zh-CN) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI Variable Display", "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK SC'; }
.pdf:lang(zh-TW) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI Variable Display", "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK TC'; }
.pdf:lang(ko-KR) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI Variable Display", "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK KR'; }
.pdf .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK JP'; }
.pdf:lang(zh-CN) .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK SC'; }
.pdf:lang(zh-TW) .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK TC'; }
.pdf:lang(ko-KR) .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK KR'; }
.pdf .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK JP'; }
.pdf:lang(zh-CN) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK SC'; }
.pdf:lang(zh-TW) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK TC'; }
.pdf:lang(ko-KR) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK KR'; }
.pdf .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK JP'; }
.pdf:lang(zh-CN) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK SC'; }
.pdf:lang(zh-TW) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK TC'; }
.pdf:lang(ko-KR) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK KR'; }
.highlight-default {
	color: rgba(44, 44, 43, 1);
}
.highlight-gray {
	color: rgba(125, 122, 117, 1);
	fill: rgba(125, 122, 117, 1);
}
.highlight-brown {
	color: rgba(159, 118, 90, 1);
	fill: rgba(159, 118, 90, 1);
}
.highlight-orange {
	color: rgba(210, 123, 45, 1);
	fill: rgba(210, 123, 45, 1);
}
.highlight-yellow {
	color: rgba(203, 148, 52, 1);
	fill: rgba(203, 148, 52, 1);
}
.highlight-teal {
	color: rgba(80, 148, 110, 1);
	fill: rgba(80, 148, 110, 1);
}
.highlight-blue {
	color: rgba(56, 125, 201, 1);
	fill: rgba(56, 125, 201, 1);
}
.highlight-purple {
	color: rgba(154, 107, 180, 1);
	fill: rgba(154, 107, 180, 1);
}
.highlight-pink {
	color: rgba(193, 76, 138, 1);
	fill: rgba(193, 76, 138, 1);
}
.highlight-red {
	color: rgba(207, 81, 72, 1);
	fill: rgba(207, 81, 72, 1);
}
.highlight-default_background {
	color: rgba(44, 44, 43, 1);
}
.highlight-gray_background {
	background: rgba(42, 28, 0, 0.07);
}
.highlight-brown_background {
	background: rgba(139, 46, 0, 0.086);
}
.highlight-orange_background {
	background: rgba(224, 101, 1, 0.129);
}
.highlight-yellow_background {
	background: rgba(211, 168, 0, 0.137);
}
.highlight-teal_background {
	background: rgba(0, 100, 45, 0.09);
}
.highlight-blue_background {
	background: rgba(0, 124, 215, 0.094);
}
.highlight-purple_background {
	background: rgba(102, 0, 178, 0.078);
}
.highlight-pink_background {
	background: rgba(197, 0, 93, 0.086);
}
.highlight-red_background {
	background: rgba(223, 22, 0, 0.094);
}
.block-color-default {
	color: inherit;
	fill: inherit;
}
.block-color-gray {
	color: rgba(125, 122, 117, 1);
	fill: rgba(125, 122, 117, 1);
}
.block-color-brown {
	color: rgba(159, 118, 90, 1);
	fill: rgba(159, 118, 90, 1);
}
.block-color-orange {
	color: rgba(210, 123, 45, 1);
	fill: rgba(210, 123, 45, 1);
}
.block-color-yellow {
	color: rgba(203, 148, 52, 1);
	fill: rgba(203, 148, 52, 1);
}
.block-color-teal {
	color: rgba(80, 148, 110, 1);
	fill: rgba(80, 148, 110, 1);
}
.block-color-blue {
	color: rgba(56, 125, 201, 1);
	fill: rgba(56, 125, 201, 1);
}
.block-color-purple {
	color: rgba(154, 107, 180, 1);
	fill: rgba(154, 107, 180, 1);
}
.block-color-pink {
	color: rgba(193, 76, 138, 1);
	fill: rgba(193, 76, 138, 1);
}
.block-color-red {
	color: rgba(207, 81, 72, 1);
	fill: rgba(207, 81, 72, 1);
}
.block-color-default_background {
	color: inherit;
	fill: inherit;
}
.block-color-gray_background {
	background: rgba(240, 239, 237, 1);
}
.block-color-brown_background {
	background: rgba(245, 237, 233, 1);
}
.block-color-orange_background {
	background: rgba(251, 235, 222, 1);
}
.block-color-yellow_background {
	background: rgba(249, 243, 220, 1);
}
.block-color-teal_background {
	background: rgba(232, 241, 236, 1);
}
.block-color-blue_background {
	background: rgba(229, 242, 252, 1);
}
.block-color-purple_background {
	background: rgba(243, 235, 249, 1);
}
.block-color-pink_background {
	background: rgba(250, 233, 241, 1);
}
.block-color-red_background {
	background: rgba(252, 233, 231, 1);
}
.select-value-color-default { background-color: rgba(42, 28, 0, 0.07); }
.select-value-color-gray { background-color: rgba(28, 19, 1, 0.11); }
.select-value-color-brown { background-color: rgba(127, 51, 0, 0.156); }
.select-value-color-orange { background-color: rgba(196, 88, 0, 0.203); }
.select-value-color-yellow { background-color: rgba(209, 156, 0, 0.282); }
.select-value-color-green { background-color: rgba(0, 96, 38, 0.156); }
.select-value-color-blue { background-color: rgba(0, 118, 217, 0.203); }
.select-value-color-purple { background-color: rgba(92, 0, 163, 0.141); }
.select-value-color-pink { background-color: rgba(183, 0, 78, 0.152); }
.select-value-color-red { background-color: rgba(206, 24, 0, 0.164); }

.checkbox {
	display: inline-flex;
	vertical-align: text-bottom;
	width: 16;
	height: 16;
	background-size: 16px;
	margin-left: 2px;
	margin-right: 5px;
}

.checkbox-on {
	background-image: url("data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2216%22%20height%3D%2216%22%20viewBox%3D%220%200%2016%2016%22%20fill%3D%22none%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%3E%0A%3Crect%20width%3D%2216%22%20height%3D%2216%22%20fill%3D%22%2358A9D7%22%2F%3E%0A%3Cpath%20d%3D%22M6.71429%2012.2852L14%204.9995L12.7143%203.71436L6.71429%209.71378L3.28571%206.2831L2%207.57092L6.71429%2012.2852Z%22%20fill%3D%22white%22%2F%3E%0A%3C%2Fsvg%3E");
}

.checkbox-off {
	background-image: url("data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2216%22%20height%3D%2216%22%20viewBox%3D%220%200%2016%2016%22%20fill%3D%22none%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%3E%0A%3Crect%20x%3D%220.75%22%20y%3D%220.75%22%20width%3D%2214.5%22%20height%3D%2214.5%22%20fill%3D%22white%22%20stroke%3D%22%2336352F%22%20stroke-width%3D%221.5%22%2F%3E%0A%3C%2Fsvg%3E");
}
	
</style></head><body><article id="9ecbf85e-b9dd-4b61-9274-cf735d5a84e0" class="page sans"><header><div class="page-header-icon undefined"><img class="icon" src="https://www.notion.so/images/app-packages/docs-icon.svg"/></div><h1 class="page-title">API 명세서</h1><p class="page-description"></p></header><div class="page-body"><table class="collection-content"><thead><tr><th><span class="icon property-icon"><img src="https://www.notion.so/icons/font_gray.svg" style="width:14px;height:14px;display:block"/></span>기능</th><th><span class="icon property-icon"><img src="https://www.notion.so/icons/list_gray.svg" style="width:14px;height:14px;display:block"/></span>Method</th><th><span class="icon property-icon"><img src="https://www.notion.so/icons/link_gray.svg" style="width:14px;height:14px;display:block"/></span>URL</th><th><span class="icon property-icon"><img src="https://www.notion.so/icons/description_gray.svg" style="width:14px;height:14px;display:block"/></span>request</th><th><span class="icon property-icon"><img src="https://www.notion.so/icons/description_gray.svg" style="width:14px;height:14px;display:block"/></span>response</th><th><span class="icon property-icon"><img src="https://www.notion.so/icons/list_gray.svg" style="width:14px;height:14px;display:block"/></span>상태코드</th><th><span class="icon property-icon"><img src="https://www.notion.so/icons/description_gray.svg" style="width:14px;height:14px;display:block"/></span>Error</th></tr></thead><tbody><tr id="13137656-55e1-4113-ac2c-ba288d504b25"><td class="cell-title"><a href="https://www.notion.so/1313765655e14113ac2cba288d504b25?pvs=21"><img class="icon notion-static-icon" src="https://www.notion.so/icons/document_blue.svg"/>일정 생성</a></td><td class="cell-notion://docs/doc_tags_property"><span class="selected-value select-value-color-green">POST</span></td><td class="cell-^G]U"><a href="http://localhost:8080/users/%7BuserId%7D/schedule_develops">http://localhost:8080/users/{userId}/schedule_develops</a></td><td class="cell-hi~k">path : userId<br/><br/>요청 body<br/>{<br/>&quot;title&quot;: &quot;제목&quot;,<br/>&quot;content&quot;:&quot;내용&quot;<br/>}</td><td class="cell-y^Mm">등록 정보<br/>{<br/>”ScheduleId&quot;: 아이디,<br/>&quot;title&quot;: &quot;제목&quot;,<br/>&quot;content&quot;: &quot;내용&quot;,<br/>&quot;userId&quot;: &quot;유저 아이디&quot;,<br/>”userName”: “유저 이름”,<br/>”userEmail”: “유저 이메일”<br/>&quot;createdAt&quot;: &quot;생성일&quot;,<br/>&quot;modifiedAt&quot;: &quot;수정일&quot;<br/>}</td><td class="cell-UEut"><span class="selected-value select-value-color-yellow">200: OK</span></td><td class="cell-\A]g"><em><code>NOT_FOUND</code></em><em> , 없는 유저입니다.</em></td></tr><tr id="757d93c4-bfa9-4691-b651-79b81a9212cf"><td class="cell-title"><a href="https://www.notion.so/757d93c4bfa94691b65179b81a9212cf?pvs=21"><img class="icon notion-static-icon" src="https://www.notion.so/icons/document_orange.svg"/>일정 선택 조회</a></td><td class="cell-notion://docs/doc_tags_property"><span class="selected-value select-value-color-brown">GET</span></td><td class="cell-^G]U"><a href="http://localhost:8080/users/%7BuserId%7D/schedule_develops">http://localhost:8080/users/{userId}/schedule_develops</a><a href="http://localhost:8080/schedule_develops/{scheduleId}">/{scheduleId}</a></td><td class="cell-hi~k">Path : <code>scheduleId</code></td><td class="cell-y^Mm">단건 응답 정보<br/>{<br/>&quot;id&quot;: 아이디,<br/>&quot;title&quot;: &quot;제목&quot;,<br/>&quot;content&quot;: &quot;내용&quot;,<br/>&quot;userId&quot;: &quot;작성 유저 아이디&quot;,<br/>&quot;userName&quot;: &quot;작성 유저 이름&quot;,<br/>&quot;userEmail&quot;: &quot;작성 유저 이메일&quot;,<br/>&quot;createdAt&quot;: &quot;생성일&quot;,<br/>&quot;modifiedAt&quot;: &quot;수정일&quot;<br/>}</td><td class="cell-UEut"><span class="selected-value select-value-color-yellow">200: OK</span></td><td class="cell-\A]g"><em><code>NOT_FOUND</code></em><em>, 없는 일정입니다</em></td></tr><tr id="2a7cd196-91b4-8069-8a4e-e061aa862c8e"><td class="cell-title"><a href="https://www.notion.so/2a7cd19691b480698a4ee061aa862c8e?pvs=21">일정 목록 조회</a></td><td class="cell-notion://docs/doc_tags_property"><span class="selected-value select-value-color-brown">GET</span></td><td class="cell-^G]U"><a href="http://localhost:8080/users/%7BuserId%7D/schedule_develops">http://localhost:8080/users/{userId}/schedule_develops</a></td><td class="cell-hi~k">path : userId </td><td class="cell-y^Mm">다건 응답 정보<br/>List<br/>{<br/>&quot;id&quot;: 아이디,<br/>&quot;title&quot;: &quot;제목&quot;,<br/>&quot;content&quot;: &quot;내용&quot;,<br/>&quot;userName&quot;: &quot;작성 유저명&quot;,<br/>&quot;userEmail&quot;: &quot;작성 유저 이메일&quot;,<br/>&quot;createdAt&quot;: &quot;생성일&quot;,<br/>&quot;modifiedAt&quot;: &quot;수정일&quot;<br/>}</td><td class="cell-UEut"><span class="selected-value select-value-color-yellow">200: OK</span></td><td class="cell-\A]g"><em><code>NOT_FOUND</code></em><em>, 없는 유저입니다</em></td></tr><tr id="b5799c55-8c0d-40d8-8059-e05cfb7bc1ae"><td class="cell-title"><a href="https://www.notion.so/b5799c558c0d40d88059e05cfb7bc1ae?pvs=21"><img class="icon notion-static-icon" src="https://www.notion.so/icons/document_yellow.svg"/>일정 수정</a></td><td class="cell-notion://docs/doc_tags_property"><span class="selected-value select-value-color-red">PUT</span></td><td class="cell-^G]U"><a href="http://localhost:8080/users/%7BuserId%7D/schedule_develops">http://localhost:8080/users/{userId}/schedule_develops</a><a href="http://localhost:8080/schedule_develops/%7BscheduleId%7D">/{scheduleId}</a></td><td class="cell-hi~k">path : &quot;<code>scheduleId</code>&quot;: 아이디<br/><br/>요청 body<br/>{<br/>&quot;title&quot;: &quot;제목&quot;,<br/>&quot;content&quot;: &quot;내용&quot;,<br/>&quot;password&quot;: &quot;비밀번호&quot;<br/>}</td><td class="cell-y^Mm">수정 정보<br/><br/>{<br/>&quot;id&quot;: 아이디,<br/>&quot;title&quot;: &quot;제목&quot;,<br/>&quot;content&quot;: &quot;내용&quot;,<br/>&quot;createdAt&quot;: &quot;생성일&quot;,<br/>&quot;modifiedAt&quot;: &quot;수정일&quot;<br/>}</td><td class="cell-UEut"><span class="selected-value select-value-color-yellow">200: OK</span></td><td class="cell-\A]g"><em><code>NOT_FOUND</code></em><em>, 없는 일정입니다</em><br/><em><code>UNAUTHORIZED</code></em><em>, 잘못된 비밀번호입니다</em></td></tr><tr id="e7816c47-027a-4d91-ad4b-bb3380100b2d"><td class="cell-title"><a href="https://www.notion.so/e7816c47027a4d91ad4bbb3380100b2d?pvs=21"><img class="icon notion-static-icon" src="https://www.notion.so/icons/document_blue.svg"/>일정 삭제</a></td><td class="cell-notion://docs/doc_tags_property"><span class="selected-value select-value-color-gray">DELETE</span></td><td class="cell-^G]U"><a href="http://localhost:8080/users/%7BuserId%7D/schedule_develops">http://localhost:8080/users/{userId}/schedule_develops</a><a href="http://localhost:8080/schedule_develops/%7BscheduleId%7D">/{scheduleId}</a></td><td class="cell-hi~k">path : <code>scheduleId</code><br/><br/>요청 body<br/>{<br/>&quot;password&quot;: &quot;비밀번호&quot;<br/>}</td><td class="cell-y^Mm">-</td><td class="cell-UEut"><span class="selected-value select-value-color-pink">200: NO_CONTENT</span></td><td class="cell-\A]g"><em><code>NOT_FOUND</code></em><em>, 없는 일정입니다<br/></em><em><code>UNAUTHORIZED</code></em><em>, 잘못된 비밀번호입니다</em></td></tr><tr id="2a7cd196-91b4-80a1-b98b-f7eab4829f92"><td class="cell-title"><a href="https://www.notion.so/2a7cd19691b480a1b98bf7eab4829f92?pvs=21">유저 생성</a></td><td class="cell-notion://docs/doc_tags_property"><span class="selected-value select-value-color-green">POST</span></td><td class="cell-^G]U"><a href="http://localhost:8080/users">http://localhost:8080/users</a></td><td class="cell-hi~k">요청 body<br/>{<br/>&quot;name&quot;: &quot;유저명&quot;,<br/>”email&quot;:&quot;이메일&quot;<br/>”password&quot;:&quot;비밀번호&quot;<br/>}</td><td class="cell-y^Mm">등록 정보<br/>{<br/>&quot;name&quot;: &quot;유저명&quot;,<br/>”email&quot;:&quot;이메일&quot;,<br/>&quot;createdAt&quot;: &quot;생성일&quot;,<br/>&quot;modifiedAt&quot;: &quot;수정일&quot;<br/>}</td><td class="cell-UEut"><span class="selected-value select-value-color-orange">200: 정상 등록</span></td><td class="cell-\A]g"><em><code>BAD_REQUEST</code></em> 이미 사용 중인 이메일입니다.</td></tr><tr id="2b1cd196-91b4-8060-baec-cd021ad2af4c"><td class="cell-title"><a href="https://www.notion.so/2b1cd19691b48060baeccd021ad2af4c?pvs=21">로그인</a></td><td class="cell-notion://docs/doc_tags_property"><span class="selected-value select-value-color-green">POST</span></td><td class="cell-^G]U"><a href="http://localhost:8080/login">http://localhost:8080/login</a></td><td class="cell-hi~k">요청 body<br/>{<br/>”email&quot;:&quot;이메일&quot;<br/>”password&quot;:&quot;비밀번호&quot;<br/>}<br/>session 생성</td><td class="cell-y^Mm">void</td><td class="cell-UEut"><span class="selected-value select-value-color-yellow">200: OK</span></td><td class="cell-\A]g"><em><code>UNAUTHORIZED</code></em><em> , 잘못된 이메일, 혹은 비밀번호입니다.</em></td></tr><tr id="2a7cd196-91b4-8024-b11b-d7432af08a64"><td class="cell-title"><a href="https://www.notion.so/2a7cd19691b48024b11bd7432af08a64?pvs=21">유저 선택 조회</a></td><td class="cell-notion://docs/doc_tags_property"><span class="selected-value select-value-color-brown">GET</span></td><td class="cell-^G]U"><a href="http://localhost:8080/schedule_develops/%7BscheduleId%7D">http://localhost:8080/users/{userId}</a></td><td class="cell-hi~k">path : userId</td><td class="cell-y^Mm">응답 정보<br/>{<br/>&quot;userId&quot;: 유저 아이디,<br/>&quot;name&quot;: &quot;유저명&quot;,<br/>&quot;email&quot;: &quot;유저 이메일&quot;,<br/>&quot;createdAt&quot;: &quot;생성일&quot;,<br/>&quot;modifiedAt&quot;: &quot;수정일&quot;<br/>}</td><td class="cell-UEut"><span class="selected-value select-value-color-yellow">200: OK</span></td><td class="cell-\A]g"><em><code>NOT_FOUND</code></em><em> , 없는 유저입니다</em></td></tr><tr id="2a8cd196-91b4-808c-b4a2-c67a393ea2ba"><td class="cell-title"><a href="https://www.notion.so/2a8cd19691b4808cb4a2c67a393ea2ba?pvs=21">유저 전부 조회</a></td><td class="cell-notion://docs/doc_tags_property"><span class="selected-value select-value-color-brown">GET</span></td><td class="cell-^G]U"><a href="http://localhost:8080/schedule_develops/%7BscheduleId%7D">http://localhost:8080/users</a></td><td class="cell-hi~k">-</td><td class="cell-y^Mm">응답 정보<br/>List<br/>{<br/>&quot;userId&quot;: 유저 아이디,<br/>&quot;name&quot;: &quot;유저명&quot;,<br/>&quot;email&quot;: &quot;유저 이메일&quot;,<br/>&quot;createdAt&quot;: &quot;생성일&quot;,<br/>&quot;modifiedAt&quot;: &quot;수정일&quot;<br/>}</td><td class="cell-UEut"><span class="selected-value select-value-color-yellow">200: OK</span></td><td class="cell-\A]g"></td></tr><tr id="2a7cd196-91b4-8071-9d41-e63721c2dfe5"><td class="cell-title"><a href="https://www.notion.so/2a7cd19691b480719d41e63721c2dfe5?pvs=21"><img class="icon notion-static-icon" src="https://www.notion.so/icons/document_yellow.svg"/>유저 수정</a></td><td class="cell-notion://docs/doc_tags_property"><span class="selected-value select-value-color-purple">PATCH</span></td><td class="cell-^G]U"><a href="http://localhost:8080/schedule_develops/%7BscheduleId%7D">http://localhost:8080/users</a></td><td class="cell-hi~k">session에서 받아올 정보<br/>{<br/>&quot;id&quot;: &quot;아이디&quot;,<br/>”name&quot;: &quot;이름&quot;<br/>}<br/><br/>요청 body<br/>{<br/>&quot;name&quot;: &quot;이름&quot;,<br/>”email&quot;: &quot;이메일&quot;<br/>}</td><td class="cell-y^Mm">수정 정보<br/><br/>{<br/>&quot;id&quot;: 유저 아이디,<br/>&quot;name&quot;: “이름&quot;,<br/>”password”: “이메일”,<br/>&quot;createdAt&quot;: &quot;생성일&quot;,<br/>&quot;modifiedAt&quot;: &quot;수정일&quot;<br/>}</td><td class="cell-UEut"><span class="selected-value select-value-color-yellow">200: OK</span></td><td class="cell-\A]g"><em><code>NOT_FOUND</code></em><em> , 없는 유저입니다.</em></td></tr><tr id="2a7cd196-91b4-807e-8276-ff7ed6b5a6f5"><td class="cell-title"><a href="https://www.notion.so/2a7cd19691b4807e8276ff7ed6b5a6f5?pvs=21"><img class="icon notion-static-icon" src="https://www.notion.so/icons/document_blue.svg"/>유저 삭제</a></td><td class="cell-notion://docs/doc_tags_property"><span class="selected-value select-value-color-gray">DELETE</span></td><td class="cell-^G]U"><a href="http://localhost:8080/schedule_develops/%7BscheduleId%7D">http://localhost:8080/schedule_develops/{scheduleId}</a></td><td class="cell-hi~k">session에서 받아올 정보<br/>{<br/>&quot;id&quot;: &quot;아이디&quot;,<br/>”name&quot;: &quot;이름&quot;<br/>}</td><td class="cell-y^Mm">void</td><td class="cell-UEut"><span class="selected-value select-value-color-pink">200: NO_CONTENT</span></td><td class="cell-\A]g"><em><code>NOT_FOUND</code></em><em> , 없는 유저입니다</em></td></tr></tbody></table><br/><br/></div></article><span class="sans" style="font-size:14px;padding-top:2em"></span></body></html>
