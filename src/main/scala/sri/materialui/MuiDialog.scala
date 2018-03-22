package sri.materialui


import sri.core._
import sri.universal._

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault, OptionalParam, DangerousUnionToJSAnyImplicit}
import sri.web.vdom.ReactEventAliases._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|





 @js.native
 @JSImport("material-ui/Dialog",JSImport.Default)
object MuiDialogComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiDialog {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
leaveTransitionDuration : OptionalParam[Double | Int] = OptDefault,
className : OptionalParam[String] = OptDefault,
ignoreBackdropClick : OptionalParam[Boolean] = OptDefault,
enterTransitionDuration : OptionalParam[Double | Int] = OptDefault,
onExit : OptionalParam[(ReactEventH) => _] = OptDefault,
transition : OptionalParam[js.Function | ReactElement] = OptDefault,
maxWidth : OptionalParam[MuiDialogMaxWidth] = OptDefault,
open : OptionalParam[Boolean] = OptDefault,
onEnter : OptionalParam[(ReactEventH) => _] = OptDefault,
fullScreen : OptionalParam[Boolean] = OptDefault,
ignoreEscapeKeyUp : OptionalParam[Boolean] = OptDefault,
onEscapeKeyUp : OptionalParam[(ReactEventH) => _] = OptDefault,
onBackdropClick : OptionalParam[(ReactEventH) => _] = OptDefault,
onRequestClose : OptionalParam[(ReactEventH) => _] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
onExited : OptionalParam[(ReactEventH) => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
onExiting : OptionalParam[(ReactEventH) => _] = OptDefault,
onEntering : OptionalParam[(ReactEventH) => _] = OptDefault,
onEntered : OptionalParam[(ReactEventH) => _] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiDialogComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiDialogComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiDialogComponent.type](
      MuiDialogComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiDialogC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiDialogComponent.type](
      MuiDialogComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         
 @js.native
 trait MuiDialogMaxWidth extends js.Object

 object MuiDialogMaxWidth{
   @inline def XS = "xs".asInstanceOf[MuiDialogMaxWidth] 
@inline def SM = "sm".asInstanceOf[MuiDialogMaxWidth] 
@inline def MD = "md".asInstanceOf[MuiDialogMaxWidth] 
          }



     

         
