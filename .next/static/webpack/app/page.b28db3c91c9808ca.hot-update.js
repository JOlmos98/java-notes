"use strict";
/*
 * ATTENTION: An "eval-source-map" devtool has been used.
 * This devtool is neither made for production nor for readable output files.
 * It uses "eval()" calls to create a separate source file with attached SourceMaps in the browser devtools.
 * If you are trying to read the output file, select a different devtool (https://webpack.js.org/configuration/devtool/)
 * or disable the default devtool with "devtool: false".
 * If you are looking for production-ready output files, see mode: "production" (https://webpack.js.org/configuration/mode/).
 */
self["webpackHotUpdate_N_E"]("app/page",{

/***/ "(app-pages-browser)/./app/page.tsx":
/*!**********************!*\
  !*** ./app/page.tsx ***!
  \**********************/
/***/ (function(module, __webpack_exports__, __webpack_require__) {

eval(__webpack_require__.ts("__webpack_require__.r(__webpack_exports__);\n/* harmony export */ __webpack_require__.d(__webpack_exports__, {\n/* harmony export */   \"default\": function() { return /* binding */ Home; }\n/* harmony export */ });\n/* harmony import */ var react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! react/jsx-dev-runtime */ \"(app-pages-browser)/./node_modules/next/dist/compiled/react/jsx-dev-runtime.js\");\n/* harmony import */ var react__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! react */ \"(app-pages-browser)/./node_modules/next/dist/compiled/react/index.js\");\n/* harmony import */ var react__WEBPACK_IMPORTED_MODULE_1___default = /*#__PURE__*/__webpack_require__.n(react__WEBPACK_IMPORTED_MODULE_1__);\n/* harmony import */ var next_navigation__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! next/navigation */ \"(app-pages-browser)/./node_modules/next/dist/api/navigation.js\");\n/* __next_internal_client_entry_do_not_use__ default auto */ \nvar _s = $RefreshSig$();\n//import Image from \"next/image\";\n\n\nfunction Home() {\n    _s();\n    const [userId, setUserId] = (0,react__WEBPACK_IMPORTED_MODULE_1__.useState)(\"\");\n    const [message, setMessage] = (0,react__WEBPACK_IMPORTED_MODULE_1__.useState)(\"\");\n    const router = (0,next_navigation__WEBPACK_IMPORTED_MODULE_2__.useRouter)();\n    const handleSubmit = async (e)=>{\n        e.preventDefault();\n        const res = await fetch(\"/api/verifyUserId\", {\n            method: \"POST\",\n            headers: {\n                \"Content-Type\": \"application/json\"\n            },\n            body: JSON.stringify({\n                userId\n            })\n        });\n        const data = await res.json();\n        //if (res.ok){\n        //router.push(`/general/userIn?userId=${encodeURIComponent(userId)}`);\n        //Con esto redirigimos a UserIn, esto queda obsoleto porque ahora importamos next/navigation\n        //router.push( \n        //pathname: './(general)/userIn/page.tsx',\n        //query: {name:data.userName}\n        //);\n        //} else {\n        //setMessage(data.message);\n        //}\n        if (res.ok) {\n            alert(\"El ID es correcto: \" + userId + \" \" + typeof userId); // Ventana emergente si el ID es correcto\n            router.push(\"/userData?userId=\".concat(encodeURIComponent(userId)));\n            console.log(\"userId:\", userId);\n        } else {\n            alert(\"ID inv\\xe1lido\"); // Ventana emergente si el ID no es válido\n        }\n    };\n    //HTML que define la web: [10px_1fr_10px]\n    return /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"div\", {\n        className: \"grid grid-rows-[1fr_auto] items-center justify-items-center m-5 font-[family-name:var(--font-geist-sans)]\",\n        children: [\n            /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"h1\", {\n                className: \"flex p-3 gap-6 rounded-3xl  text-8xl\",\n                children: \"CTIcontrol\"\n            }, void 0, false, {\n                fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                lineNumber: 49,\n                columnNumber: 7\n            }, this),\n            /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"main\", {\n                className: \"flex flex-col gap-6 row-start-2 items-center sm:items-start\",\n                children: [\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"span\", {\n                        className: \"flex text-3xl\",\n                        children: \"Bienvenido a la interfaz de usuario de [insertar nombre de hardware].\"\n                    }, void 0, false, {\n                        fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                        lineNumber: 51,\n                        columnNumber: 9\n                    }, this),\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"span\", {\n                        className: \"flex text-3xl\",\n                        children: \"Introduce tu n\\xfamero de usuario:\"\n                    }, void 0, false, {\n                        fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                        lineNumber: 52,\n                        columnNumber: 9\n                    }, this),\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"input\", {\n                        typeof: \"text\",\n                        value: userId,\n                        onChange: (e)=>setUserId(e.target.value),\n                        className: \"text-black block mx-auto p-3 rounded-3xl border-slate-700 border-2\",\n                        type: \"text\",\n                        id: \"userId\",\n                        placeholder: \"Inserta tu n\\xfamero de usuario\",\n                        required: true\n                    }, void 0, false, {\n                        fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                        lineNumber: 54,\n                        columnNumber: 9\n                    }, this),\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"form\", {\n                        onSubmit: handleSubmit,\n                        className: \"flex justify-center w-full\",\n                        children: /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"button\", {\n                            type: \"submit\" /*onClick={saludar}*/ ,\n                            className: \"flex bg-blue-300 bg-opacity-30 p-4 mx-auto rounded-3xl text-3xl\",\n                            children: \"Log in\"\n                        }, void 0, false, {\n                            fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                            lineNumber: 60,\n                            columnNumber: 11\n                        }, this)\n                    }, void 0, false, {\n                        fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                        lineNumber: 59,\n                        columnNumber: 9\n                    }, this),\n                    message && /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"span\", {\n                        className: \"flex text-3xl\",\n                        children: message\n                    }, void 0, false, {\n                        fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                        lineNumber: 62,\n                        columnNumber: 21\n                    }, this),\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"div\", {\n                        className: \"flex justify-between items-center\",\n                        children: [\n                            /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"div\", {\n                                className: \"flex flex-col gap-4 justify-center\",\n                                children: [\n                                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"a\", {\n                                        className: \"flex bg-blue-300 bg-opacity-30 p-5 m-0 rounded-3xl text-5xl\",\n                                        href: \"/howtouse\",\n                                        children: \"How To Use\"\n                                    }, void 0, false, {\n                                        fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                                        lineNumber: 65,\n                                        columnNumber: 9\n                                    }, this),\n                                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"a\", {\n                                        className: \"flex bg-blue-300 bg-opacity-30 p-5 m-0 rounded-3xl text-5xl\",\n                                        href: \"/pricing\",\n                                        children: \"Pricing\"\n                                    }, void 0, false, {\n                                        fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                                        lineNumber: 66,\n                                        columnNumber: 9\n                                    }, this),\n                                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"a\", {\n                                        className: \"flex bg-blue-300 bg-opacity-30 p-5 m-0 rounded-3xl text-5xl\",\n                                        href: \"/contact\",\n                                        children: \"Contact\"\n                                    }, void 0, false, {\n                                        fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                                        lineNumber: 67,\n                                        columnNumber: 9\n                                    }, this)\n                                ]\n                            }, void 0, true, {\n                                fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                                lineNumber: 64,\n                                columnNumber: 9\n                            }, this),\n                            /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"div\", {\n                                children: /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"img\", {\n                                    src: \"/Logo-CTI-png.png\",\n                                    alt: \"Logo CTIcontrol\",\n                                    className: \"h-32 w-auto ml-40\"\n                                }, void 0, false, {\n                                    fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                                    lineNumber: 70,\n                                    columnNumber: 11\n                                }, this)\n                            }, void 0, false, {\n                                fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                                lineNumber: 69,\n                                columnNumber: 9\n                            }, this)\n                        ]\n                    }, void 0, true, {\n                        fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                        lineNumber: 63,\n                        columnNumber: 9\n                    }, this)\n                ]\n            }, void 0, true, {\n                fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n                lineNumber: 50,\n                columnNumber: 7\n            }, this)\n        ]\n    }, void 0, true, {\n        fileName: \"/home/desarrollo1/nextProjects/app/page.tsx\",\n        lineNumber: 48,\n        columnNumber: 5\n    }, this);\n} /*\n  Importamos la librería useRouter de next/router\n  y la declaramos como router\n  \n  Usamos el hook useState para almacenar el usuarioId\n\n  Uso de encodeURIComponent: Esto sigue siendo importante \n  para asegurar que el nombre del usuario se pase correctamente \n  como parámetro en la URL.\n*/ \n_s(Home, \"ipP4O4S3z7l0fP+3PMoNjqKKuzM=\", false, function() {\n    return [\n        next_navigation__WEBPACK_IMPORTED_MODULE_2__.useRouter\n    ];\n});\n_c = Home;\nvar _c;\n$RefreshReg$(_c, \"Home\");\n\n\n;\n    // Wrapped in an IIFE to avoid polluting the global scope\n    ;\n    (function () {\n        var _a, _b;\n        // Legacy CSS implementations will `eval` browser code in a Node.js context\n        // to extract CSS. For backwards compatibility, we need to check we're in a\n        // browser context before continuing.\n        if (typeof self !== 'undefined' &&\n            // AMP / No-JS mode does not inject these helpers:\n            '$RefreshHelpers$' in self) {\n            // @ts-ignore __webpack_module__ is global\n            var currentExports = module.exports;\n            // @ts-ignore __webpack_module__ is global\n            var prevSignature = (_b = (_a = module.hot.data) === null || _a === void 0 ? void 0 : _a.prevSignature) !== null && _b !== void 0 ? _b : null;\n            // This cannot happen in MainTemplate because the exports mismatch between\n            // templating and execution.\n            self.$RefreshHelpers$.registerExportsForReactRefresh(currentExports, module.id);\n            // A module can be accepted automatically based on its exports, e.g. when\n            // it is a Refresh Boundary.\n            if (self.$RefreshHelpers$.isReactRefreshBoundary(currentExports)) {\n                // Save the previous exports signature on update so we can compare the boundary\n                // signatures. We avoid saving exports themselves since it causes memory leaks (https://github.com/vercel/next.js/pull/53797)\n                module.hot.dispose(function (data) {\n                    data.prevSignature =\n                        self.$RefreshHelpers$.getRefreshBoundarySignature(currentExports);\n                });\n                // Unconditionally accept an update to this module, we'll check if it's\n                // still a Refresh Boundary later.\n                // @ts-ignore importMeta is replaced in the loader\n                module.hot.accept();\n                // This field is set when the previous version of this module was a\n                // Refresh Boundary, letting us know we need to check for invalidation or\n                // enqueue an update.\n                if (prevSignature !== null) {\n                    // A boundary can become ineligible if its exports are incompatible\n                    // with the previous exports.\n                    //\n                    // For example, if you add/remove/change exports, we'll want to\n                    // re-execute the importing modules, and force those components to\n                    // re-render. Similarly, if you convert a class component to a\n                    // function, we want to invalidate the boundary.\n                    if (self.$RefreshHelpers$.shouldInvalidateReactRefreshBoundary(prevSignature, self.$RefreshHelpers$.getRefreshBoundarySignature(currentExports))) {\n                        module.hot.invalidate();\n                    }\n                    else {\n                        self.$RefreshHelpers$.scheduleUpdate();\n                    }\n                }\n            }\n            else {\n                // Since we just executed the code for the module, it's possible that the\n                // new exports made it ineligible for being a boundary.\n                // We only care about the case when we were _previously_ a boundary,\n                // because we already accepted this update (accidental side effect).\n                var isNoLongerABoundary = prevSignature !== null;\n                if (isNoLongerABoundary) {\n                    module.hot.invalidate();\n                }\n            }\n        }\n    })();\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoiKGFwcC1wYWdlcy1icm93c2VyKS8uL2FwcC9wYWdlLnRzeCIsIm1hcHBpbmdzIjoiOzs7Ozs7Ozs7O0FBRUEsaUNBQWlDO0FBQ087QUFDSTtBQUU3QixTQUFTRzs7SUFFdEIsTUFBTSxDQUFDQyxRQUFRQyxVQUFVLEdBQUdKLCtDQUFRQSxDQUFDO0lBQ3JDLE1BQU0sQ0FBQ0ssU0FBU0MsV0FBVyxHQUFHTiwrQ0FBUUEsQ0FBQztJQUN2QyxNQUFNTyxTQUFPTiwwREFBU0E7SUFFdEIsTUFBTU8sZUFBYSxPQUFNQztRQUN2QkEsRUFBRUMsY0FBYztRQUNoQixNQUFNQyxNQUFJLE1BQU1DLE1BQU0scUJBQXFCO1lBQ3pDQyxRQUFPO1lBQ1BDLFNBQVE7Z0JBQ04sZ0JBQWU7WUFDakI7WUFDQUMsTUFBS0MsS0FBS0MsU0FBUyxDQUFDO2dCQUFDZDtZQUFNO1FBQzdCO1FBQ0EsTUFBTWUsT0FBSyxNQUFNUCxJQUFJUSxJQUFJO1FBQ3pCLGNBQWM7UUFDWixzRUFBc0U7UUFFdEUsNEZBQTRGO1FBQzVGLGVBQWU7UUFDYiwwQ0FBMEM7UUFDMUMsNkJBQTZCO1FBQy9CLElBQUk7UUFDTixVQUFVO1FBQ1IsMkJBQTJCO1FBQzdCLEdBQUc7UUFFSCxJQUFJUixJQUFJUyxFQUFFLEVBQUU7WUFDVkMsTUFBTSx3QkFBc0JsQixTQUFPLE1BQUksT0FBT0EsU0FBVSx5Q0FBeUM7WUFDakdJLE9BQU9lLElBQUksQ0FBQyxvQkFBK0MsT0FBM0JDLG1CQUFtQnBCO1lBQ25EcUIsUUFBUUMsR0FBRyxDQUFDLFdBQVd0QjtRQUV6QixPQUFPO1lBQ0xrQixNQUFNLG1CQUFnQiwwQ0FBMEM7UUFDbEU7SUFDRjtJQUdBLHlDQUF5QztJQUN6QyxxQkFDRSw4REFBQ0s7UUFBSUMsV0FBVTs7MEJBQ2IsOERBQUNDO2dCQUFHRCxXQUFVOzBCQUF1Qzs7Ozs7OzBCQUNyRCw4REFBQ0U7Z0JBQUtGLFdBQVU7O2tDQUNkLDhEQUFDRzt3QkFBS0gsV0FBVTtrQ0FBZ0I7Ozs7OztrQ0FDaEMsOERBQUNHO3dCQUFLSCxXQUFVO2tDQUFnQjs7Ozs7O2tDQUVoQyw4REFBQ0k7d0JBQ0NDLFFBQU87d0JBQ1BDLE9BQU85Qjt3QkFDUCtCLFVBQVUsQ0FBQ3pCLElBQUlMLFVBQVVLLEVBQUUwQixNQUFNLENBQUNGLEtBQUs7d0JBQ3ZDTixXQUFVO3dCQUFxRVMsTUFBSzt3QkFBT0MsSUFBRzt3QkFBU0MsYUFBWTt3QkFBK0JDLFFBQVE7Ozs7OztrQ0FDNUosOERBQUNDO3dCQUFLQyxVQUFVakM7d0JBQWNtQixXQUFVO2tDQUN0Qyw0RUFBQ2U7NEJBQU9OLE1BQUssU0FBUyxtQkFBbUI7NEJBQUdULFdBQVU7c0NBQWtFOzs7Ozs7Ozs7OztvQkFFekh0Qix5QkFBVyw4REFBQ3lCO3dCQUFLSCxXQUFVO2tDQUFpQnRCOzs7Ozs7a0NBQzdDLDhEQUFDcUI7d0JBQUlDLFdBQVU7OzBDQUNmLDhEQUFDRDtnQ0FBSUMsV0FBVTs7a0RBQ2YsOERBQUNnQjt3Q0FBRWhCLFdBQVU7d0NBQThEaUIsTUFBSztrREFBWTs7Ozs7O2tEQUM1Riw4REFBQ0Q7d0NBQUVoQixXQUFVO3dDQUE4RGlCLE1BQUs7a0RBQVc7Ozs7OztrREFDM0YsOERBQUNEO3dDQUFFaEIsV0FBVTt3Q0FBOERpQixNQUFLO2tEQUFXOzs7Ozs7Ozs7Ozs7MENBRTNGLDhEQUFDbEI7MENBQ0MsNEVBQUNtQjtvQ0FBSUMsS0FBSTtvQ0FBb0JDLEtBQUk7b0NBQWtCcEIsV0FBVTs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7QUFNdkUsRUFFQTs7Ozs7Ozs7O0FBU0E7R0FoRndCekI7O1FBSVRELHNEQUFTQTs7O0tBSkFDIiwic291cmNlcyI6WyJ3ZWJwYWNrOi8vX05fRS8uL2FwcC9wYWdlLnRzeD83NjAzIl0sInNvdXJjZXNDb250ZW50IjpbIlwidXNlIGNsaWVudFwiO1xuXG4vL2ltcG9ydCBJbWFnZSBmcm9tIFwibmV4dC9pbWFnZVwiO1xuaW1wb3J0IFJlYWN0LCB7IHVzZVN0YXRlIH0gZnJvbSBcInJlYWN0XCI7XG5pbXBvcnQgeyB1c2VSb3V0ZXIgfSBmcm9tIFwibmV4dC9uYXZpZ2F0aW9uXCI7XG5cbmV4cG9ydCBkZWZhdWx0IGZ1bmN0aW9uIEhvbWUoKSB7XG5cbiAgY29uc3QgW3VzZXJJZCwgc2V0VXNlcklkXSA9IHVzZVN0YXRlKFwiXCIpO1xuICBjb25zdCBbbWVzc2FnZSwgc2V0TWVzc2FnZV0gPSB1c2VTdGF0ZShcIlwiKTtcbiAgY29uc3Qgcm91dGVyPXVzZVJvdXRlcigpO1xuXG4gIGNvbnN0IGhhbmRsZVN1Ym1pdD1hc3luYyhlOlJlYWN0LkZvcm1FdmVudCk9PntcbiAgICBlLnByZXZlbnREZWZhdWx0KCk7XG4gICAgY29uc3QgcmVzPWF3YWl0IGZldGNoKFwiL2FwaS92ZXJpZnlVc2VySWRcIiwge1xuICAgICAgbWV0aG9kOlwiUE9TVFwiLFxuICAgICAgaGVhZGVyczp7XG4gICAgICAgIFwiQ29udGVudC1UeXBlXCI6XCJhcHBsaWNhdGlvbi9qc29uXCIsXG4gICAgICB9LFxuICAgICAgYm9keTpKU09OLnN0cmluZ2lmeSh7dXNlcklkfSksXG4gICAgfSk7XG4gICAgY29uc3QgZGF0YT1hd2FpdCByZXMuanNvbigpO1xuICAgIC8vaWYgKHJlcy5vayl7XG4gICAgICAvL3JvdXRlci5wdXNoKGAvZ2VuZXJhbC91c2VySW4/dXNlcklkPSR7ZW5jb2RlVVJJQ29tcG9uZW50KHVzZXJJZCl9YCk7XG5cbiAgICAgIC8vQ29uIGVzdG8gcmVkaXJpZ2ltb3MgYSBVc2VySW4sIGVzdG8gcXVlZGEgb2Jzb2xldG8gcG9ycXVlIGFob3JhIGltcG9ydGFtb3MgbmV4dC9uYXZpZ2F0aW9uXG4gICAgICAvL3JvdXRlci5wdXNoKCBcbiAgICAgICAgLy9wYXRobmFtZTogJy4vKGdlbmVyYWwpL3VzZXJJbi9wYWdlLnRzeCcsXG4gICAgICAgIC8vcXVlcnk6IHtuYW1lOmRhdGEudXNlck5hbWV9XG4gICAgICAvLyk7XG4gICAgLy99IGVsc2Uge1xuICAgICAgLy9zZXRNZXNzYWdlKGRhdGEubWVzc2FnZSk7XG4gICAgLy99XG4gICAgXG4gICAgaWYgKHJlcy5vaykge1xuICAgICAgYWxlcnQoXCJFbCBJRCBlcyBjb3JyZWN0bzogXCIrdXNlcklkK1wiIFwiK3R5cGVvZih1c2VySWQpKTsgLy8gVmVudGFuYSBlbWVyZ2VudGUgc2kgZWwgSUQgZXMgY29ycmVjdG9cbiAgICAgIHJvdXRlci5wdXNoKGAvdXNlckRhdGE/dXNlcklkPSR7ZW5jb2RlVVJJQ29tcG9uZW50KHVzZXJJZCl9YCk7XG4gICAgICBjb25zb2xlLmxvZyhcInVzZXJJZDpcIiwgdXNlcklkKTtcblxuICAgIH0gZWxzZSB7XG4gICAgICBhbGVydChcIklEIGludsOhbGlkb1wiKTsgLy8gVmVudGFuYSBlbWVyZ2VudGUgc2kgZWwgSUQgbm8gZXMgdsOhbGlkb1xuICAgIH1cbiAgfTtcblxuXG4gIC8vSFRNTCBxdWUgZGVmaW5lIGxhIHdlYjogWzEwcHhfMWZyXzEwcHhdXG4gIHJldHVybiAoXG4gICAgPGRpdiBjbGFzc05hbWU9XCJncmlkIGdyaWQtcm93cy1bMWZyX2F1dG9dIGl0ZW1zLWNlbnRlciBqdXN0aWZ5LWl0ZW1zLWNlbnRlciBtLTUgZm9udC1bZmFtaWx5LW5hbWU6dmFyKC0tZm9udC1nZWlzdC1zYW5zKV1cIj5cbiAgICAgIDxoMSBjbGFzc05hbWU9XCJmbGV4IHAtMyBnYXAtNiByb3VuZGVkLTN4bCAgdGV4dC04eGxcIj5DVEljb250cm9sPC9oMT5cbiAgICAgIDxtYWluIGNsYXNzTmFtZT1cImZsZXggZmxleC1jb2wgZ2FwLTYgcm93LXN0YXJ0LTIgaXRlbXMtY2VudGVyIHNtOml0ZW1zLXN0YXJ0XCI+XG4gICAgICAgIDxzcGFuIGNsYXNzTmFtZT1cImZsZXggdGV4dC0zeGxcIj5CaWVudmVuaWRvIGEgbGEgaW50ZXJmYXogZGUgdXN1YXJpbyBkZSBbaW5zZXJ0YXIgbm9tYnJlIGRlIGhhcmR3YXJlXS48L3NwYW4+XG4gICAgICAgIDxzcGFuIGNsYXNzTmFtZT1cImZsZXggdGV4dC0zeGxcIj5JbnRyb2R1Y2UgdHUgbsO6bWVybyBkZSB1c3VhcmlvOjwvc3Bhbj5cbiAgICAgICAgXG4gICAgICAgIDxpbnB1dCBcbiAgICAgICAgICB0eXBlb2Y9XCJ0ZXh0XCJcbiAgICAgICAgICB2YWx1ZT17dXNlcklkfVxuICAgICAgICAgIG9uQ2hhbmdlPXsoZSk9PnNldFVzZXJJZChlLnRhcmdldC52YWx1ZSl9XG4gICAgICAgICAgY2xhc3NOYW1lPVwidGV4dC1ibGFjayBibG9jayBteC1hdXRvIHAtMyByb3VuZGVkLTN4bCBib3JkZXItc2xhdGUtNzAwIGJvcmRlci0yXCIgdHlwZT1cInRleHRcIiBpZD1cInVzZXJJZFwiIHBsYWNlaG9sZGVyPVwiSW5zZXJ0YSB0dSBuw7ptZXJvIGRlIHVzdWFyaW9cIiByZXF1aXJlZD48L2lucHV0PlxuICAgICAgICA8Zm9ybSBvblN1Ym1pdD17aGFuZGxlU3VibWl0fSBjbGFzc05hbWU9XCJmbGV4IGp1c3RpZnktY2VudGVyIHctZnVsbFwiPlxuICAgICAgICAgIDxidXR0b24gdHlwZT1cInN1Ym1pdFwiIC8qb25DbGljaz17c2FsdWRhcn0qLyBjbGFzc05hbWU9XCJmbGV4IGJnLWJsdWUtMzAwIGJnLW9wYWNpdHktMzAgcC00IG14LWF1dG8gcm91bmRlZC0zeGwgdGV4dC0zeGxcIj5Mb2cgaW48L2J1dHRvbj5cbiAgICAgICAgPC9mb3JtPlxuICAgICAgICB7bWVzc2FnZSAmJiA8c3BhbiBjbGFzc05hbWU9XCJmbGV4IHRleHQtM3hsXCI+e21lc3NhZ2V9PC9zcGFuPn1cbiAgICAgICAgPGRpdiBjbGFzc05hbWU9XCJmbGV4IGp1c3RpZnktYmV0d2VlbiBpdGVtcy1jZW50ZXJcIj5cbiAgICAgICAgPGRpdiBjbGFzc05hbWU9XCJmbGV4IGZsZXgtY29sIGdhcC00IGp1c3RpZnktY2VudGVyXCI+XG4gICAgICAgIDxhIGNsYXNzTmFtZT1cImZsZXggYmctYmx1ZS0zMDAgYmctb3BhY2l0eS0zMCBwLTUgbS0wIHJvdW5kZWQtM3hsIHRleHQtNXhsXCIgaHJlZj1cIi9ob3d0b3VzZVwiPkhvdyBUbyBVc2U8L2E+XG4gICAgICAgIDxhIGNsYXNzTmFtZT1cImZsZXggYmctYmx1ZS0zMDAgYmctb3BhY2l0eS0zMCBwLTUgbS0wIHJvdW5kZWQtM3hsIHRleHQtNXhsXCIgaHJlZj1cIi9wcmljaW5nXCI+UHJpY2luZzwvYT5cbiAgICAgICAgPGEgY2xhc3NOYW1lPVwiZmxleCBiZy1ibHVlLTMwMCBiZy1vcGFjaXR5LTMwIHAtNSBtLTAgcm91bmRlZC0zeGwgdGV4dC01eGxcIiBocmVmPVwiL2NvbnRhY3RcIj5Db250YWN0PC9hPlxuICAgICAgICA8L2Rpdj5cbiAgICAgICAgPGRpdj5cbiAgICAgICAgICA8aW1nIHNyYz1cIi9Mb2dvLUNUSS1wbmcucG5nXCIgYWx0PVwiTG9nbyBDVEljb250cm9sXCIgY2xhc3NOYW1lPVwiaC0zMiB3LWF1dG8gbWwtNDBcIiAvPlxuICAgICAgICA8L2Rpdj5cbiAgICAgICAgPC9kaXY+XG4gICAgICA8L21haW4+XG4gICAgPC9kaXY+XG4gICk7XG59XG5cbi8qXG4gIEltcG9ydGFtb3MgbGEgbGlicmVyw61hIHVzZVJvdXRlciBkZSBuZXh0L3JvdXRlclxuICB5IGxhIGRlY2xhcmFtb3MgY29tbyByb3V0ZXJcbiAgXG4gIFVzYW1vcyBlbCBob29rIHVzZVN0YXRlIHBhcmEgYWxtYWNlbmFyIGVsIHVzdWFyaW9JZFxuXG4gIFVzbyBkZSBlbmNvZGVVUklDb21wb25lbnQ6IEVzdG8gc2lndWUgc2llbmRvIGltcG9ydGFudGUgXG4gIHBhcmEgYXNlZ3VyYXIgcXVlIGVsIG5vbWJyZSBkZWwgdXN1YXJpbyBzZSBwYXNlIGNvcnJlY3RhbWVudGUgXG4gIGNvbW8gcGFyw6FtZXRybyBlbiBsYSBVUkwuXG4qLyJdLCJuYW1lcyI6WyJSZWFjdCIsInVzZVN0YXRlIiwidXNlUm91dGVyIiwiSG9tZSIsInVzZXJJZCIsInNldFVzZXJJZCIsIm1lc3NhZ2UiLCJzZXRNZXNzYWdlIiwicm91dGVyIiwiaGFuZGxlU3VibWl0IiwiZSIsInByZXZlbnREZWZhdWx0IiwicmVzIiwiZmV0Y2giLCJtZXRob2QiLCJoZWFkZXJzIiwiYm9keSIsIkpTT04iLCJzdHJpbmdpZnkiLCJkYXRhIiwianNvbiIsIm9rIiwiYWxlcnQiLCJwdXNoIiwiZW5jb2RlVVJJQ29tcG9uZW50IiwiY29uc29sZSIsImxvZyIsImRpdiIsImNsYXNzTmFtZSIsImgxIiwibWFpbiIsInNwYW4iLCJpbnB1dCIsInR5cGVvZiIsInZhbHVlIiwib25DaGFuZ2UiLCJ0YXJnZXQiLCJ0eXBlIiwiaWQiLCJwbGFjZWhvbGRlciIsInJlcXVpcmVkIiwiZm9ybSIsIm9uU3VibWl0IiwiYnV0dG9uIiwiYSIsImhyZWYiLCJpbWciLCJzcmMiLCJhbHQiXSwic291cmNlUm9vdCI6IiJ9\n//# sourceURL=webpack-internal:///(app-pages-browser)/./app/page.tsx\n"));

/***/ })

});